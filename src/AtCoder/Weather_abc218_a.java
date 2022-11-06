package AtCoder;

import java.util.Scanner;

public class Weather_abc218_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String sInput = sc.next();
        String[] sArry = sInput.split("");

        if (sArry[day-1].equals("o")) {
            System.out.println("Yes");
        } else System.out.println("No");

    }
}
