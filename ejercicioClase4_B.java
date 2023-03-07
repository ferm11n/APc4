import java.util.Scanner;
import java.util.Arrays;

public class ejercicioClase4_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        String order = scanner.next();

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
