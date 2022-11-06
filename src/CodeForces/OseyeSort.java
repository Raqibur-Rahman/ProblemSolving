package CodeForces;

import java.util.Scanner;

public class OseyeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        String str = sc.next();
        if (str.equals("a")) {
            for (int i = 1; i <= in; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = in; in>=1; in--) {
                System.out.println(in);
            }

        }

    }
}
