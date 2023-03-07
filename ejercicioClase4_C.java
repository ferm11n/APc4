import java.util.Arrays;
import java.util.Scanner;

public class ejercicioClase4_C {
    public static void main(String[] args) {
        int num1, num2, num3;
        String order;
        if (args.length == 4) {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            num3 = Integer.parseInt(args[2]);
            order = args[3];
        } else {
            Scanner scanner = new Scanner(System.in);
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            num3 = scanner.nextInt();
            order = scanner.next();
        }

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

        System.out.println(Arrays.toString(nums));
    }
}
