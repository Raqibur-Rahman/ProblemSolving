package AtCoder;

import java.util.Scanner;

public class FiftyFifty_abc132_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] inputArray = input.split("");


        if (inputArray[0].equals(inputArray[1])) {
            if (inputArray[1].equals(inputArray[2])) {
                System.out.println("No");
            } else if (inputArray[2].equals(inputArray[3])) {
                System.out.println("Yes");
            } else System.out.println("No");
        } else if (inputArray[0].equals(inputArray[2])) {
            if (inputArray[1].equals(inputArray[3])) {
                System.out.println("Yes");
            } else System.out.println("No");
        } else if (inputArray[0].equals(inputArray[3])) {
            if (inputArray[1].equals(inputArray[2])) {
                System.out.println("Yes");
            } else System.out.println("No");
        } else System.out.println("No");
    }
}
