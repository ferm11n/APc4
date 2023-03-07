import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase4_3 {
    public static void main(String[] args) throws FileNotFoundException {
        // Leer argumentos de la línea de comandos
        int desplazo = Integer.parseInt(args[0]);
        boolean codificar = Boolean.parseBoolean(args[1]);
        String inputFile = args[2];
        String outputFile = args[3];
        String orden = args[4];

        // Leer números del archivo de entrada
        Scanner input = new Scanner(new File(inputFile));
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            numeros[i] = input.nextInt();
        }
        input.close();

        // Aplicar codificación o decodificación si es necesario
        if (codificar) {
            for (int i = 0; i < 3; i++) {
                numeros[i] = (numeros[i] + desplazo) % 10;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                numeros[i] = (numeros[i] - desplazo + 10) % 10;
            }
        }

        // Ordenar números según la orden indicada
        if (orden.equals("ascendente")) {
            Arrays.sort(numeros);
        } else if (orden.equals("descendente")) {
            Arrays.sort(numeros);
            int temp = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = temp;
        } else {
            System.err.println("Orden inválida");
            System.exit(1);
        }

        // Escribir números ordenados en el archivo de salida
        PrintWriter output = new PrintWriter(new File(outputFile));
        for (int i = 0; i < 3; i++) {
            output.println(numeros[i]);
        }
        output.close();

        System.out.println("Proceso completado correctamente");
    }

}
