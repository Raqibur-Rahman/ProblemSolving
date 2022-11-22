package HackerRank;

import java.util.Scanner;

public class SherlockAndDivisors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            int n = s.nextInt();
            SherlockAndDivisors.solve(n);
            t--;

        }

    }

    private static void solve(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    int x = n / i;
                    if (x % 2 == 0) {
                        count++;
                    }
                    //System.out.print(i+" ");
                } else {
                    if (i % 2 == 0) {
                        count++;
                    }
                    int x = n / i;
                    if (x % 2 == 0) {
                        count++;
                    }

                    //System.out.print(i+" "+n/i+" ");
                }
            }
        }
        System.out.println(count);
    }
}
