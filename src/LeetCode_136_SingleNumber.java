import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_136_SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("# of element:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(singleNumber(nums));

    }

    private static int singleNumber(int[] nums) {

        int length = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < length; i++) {
           if(length<2 && nums[i]==1)
               return 1;
           else if (i==0) {
               sum=sum+nums[i]   ;
           }
           else if (i%2!=0)
               sum=sum-nums[i];
           else
               sum=sum+nums[i];
        }
        return sum;
    }
}
