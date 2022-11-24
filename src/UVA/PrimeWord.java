package UVA;

import java.util.Scanner;

public class PrimeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String in = sc.next();
            char[] arr = in.toCharArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (Character.isUpperCase(arr[i])) {
                    int ch = (arr[i] + 1) - 65 + 26;
                    sum = sum + ch;
                    //System.out.println(ch);
                } else {
                    int ch = (arr[i] + 1) - 97;
                    sum = sum + ch;
                    //System.out.println(ch);
                }
            }

            boolean r = true;
            for (int i = 2; i <= Math.sqrt(sum); i++) {
                if (sum % i == 0) {
                    r = false;
                    break;
                }
            }
            if (r) {
                System.out.println("It is a prime word.");
            } else System.out.println("It is not a prime word.");

        }

    }
}
