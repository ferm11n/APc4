import java.util.Arrays;
import java.util.Scanner;

public class evitarRepetirCodigo {

    //Para evitarnos repetir el codigo, podemos crear una funcion que ordene los numeros segun el criterio
    //indicado y puede ser llamada al mismo tiempo desde ambos casos, tanto A como el caso de B
    public static void main(String[] args) {
        int num1, num2, num3;
        String order;
        if (args.length == 4) {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            num3 = Integer.parseInt(args[2]);
            order = args[3];
        } else {
            Scanner scanner = new Scanner(System.in
        }
    }
}