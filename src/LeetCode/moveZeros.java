package LeetCode;

public class moveZeros {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        int[] result = moveZeroes(a);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] moveZeroes(int[] a) {
        int nonZeroIndicator = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[nonZeroIndicator] = a[i];
                nonZeroIndicator++;
            }
        }
        for (int i = nonZeroIndicator; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }
}