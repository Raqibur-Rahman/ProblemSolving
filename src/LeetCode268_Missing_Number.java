import java.util.Arrays;
import java.util.Scanner;

public class LeetCode268_Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("# of elements:");
        int arrSize = sc.nextInt();
        int nums[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(missingNumber(nums));

    }

    private static int missingNumber(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < length; i++) {
            while (i == 0 && nums[i] != 0) {
                return 0;
            }
            if (i < length - 1 && nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            } else if (i > 0 && i == length - 1) {
                return nums[i] + 1;
            } else if (i == 0 && length == 1) {
                if (nums[i] == 0)
                    return 1;
                else if (nums[i] == 1)
                    return 0;
            }

        }
        return 0;
    }
}
