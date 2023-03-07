import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejercicioClase4_2A {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Debe ingresar la ruta del archivo y la operación (sum o mul)");
            System.exit(1);
        }

        String filePath = args[0];
        String operation = args[1];

        if (!operation.equals("sum") && !operation.equals("mul")) {
            System.err.println("La operación ingresada no es válida");
            System.exit(1);
        }

        int result = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);

                if (operation.equals("sum")) {
                    result += number;
                } else {
                    result *= number;
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("El resultado de la " + operation + "a de los números del archivo es: " + result);
    }
}
