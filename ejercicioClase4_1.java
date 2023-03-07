import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase4_1 {
    //Ejercicio A
    //Declaramos viariables
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        String order = args[3];

        //Hacemos la consulta
        int[] nums = {num1, num2, num3};
        if (order.equals("asc")) {
            Arrays.sort(nums);
        } else if (order.equals("desc")) {
            Arrays.sort(nums);
            int temp;
            for (int i = 0; i < nums.length / 2; i++) {
                temp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = temp;
            }
        }
        //Imprimimos en consola
        System.out.println(Arrays.toString(nums));
    }
}
