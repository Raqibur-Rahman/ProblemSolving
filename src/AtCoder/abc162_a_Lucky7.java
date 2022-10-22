package AtCoder;

import java.util.Scanner;

public class abc162_a_Lucky7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        boolean result = false;
        while (in > 0) {
            int check = in % 10;
            if (check == 7) {
                result = true;
            }
            in = in / 10;
        }
        if (result) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
