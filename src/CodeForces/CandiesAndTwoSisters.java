package CodeForces;

import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();

        while (tc > 0) {
            int n = s.nextInt();
            int count = 0;
            for (int i = n; i >= n / 2; i--) {
                for (int j = 1; j <= n / 2; j++) {
                    if (i + j == n)
                        count++;
                }
            }
            System.out.println(count);

            tc--;
        }

    }
}
