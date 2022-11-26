package CodeChef;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        int sum=0;
        while (tc-->0){
            int number=sc.nextInt();
            while (number>0){
                int lastDigit=number%10;
                sum=sum+lastDigit;
                number=number/10;
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
