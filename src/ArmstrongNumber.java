import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int cInput = input, count = 0, outputSum = 0;

        while (cInput > 0) {
            cInput = cInput / 10;
            count++;
        }

        cInput = input;

        while (cInput > 0) {
            int remainder = cInput % 10;
            cInput = cInput / 10;

            int result = 1;

            for (int i = 1; i <= count; i++) {
                result = result * remainder;
            }

            outputSum = outputSum + result;
        }
        System.out.println(outputSum);
        if (outputSum == input) {
            System.out.println("Armstrong Number");
        } else System.out.println("Not a Armstrong Number");


    }
}
