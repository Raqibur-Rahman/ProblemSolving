package CodeForces;

import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tc = s.nextInt();
        while (tc > 0) {
            int n = s.nextInt();
            int count = 0;
            for (int i = n-1, j = 1; j<=n/2 ; i--, j++) {
                if (i + j == n && i>j)
                    count++;
            }
            System.out.println(count);

            tc--;
        }

    }
}
