package CodeForces;

import java.util.Scanner;

public class CandiesAndTwoSistersEdit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while (tc > 0) {
            int n = s.nextInt();
            if (n % 2 == 0) {
                n = n - 1;
                System.out.println(n / 2);
            } else System.out.println(n / 2);
            tc--;
        }
    }
}
