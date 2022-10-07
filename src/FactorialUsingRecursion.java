import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input=scanner.nextInt();
        int result= Factorial(input);
        System.out.println(result);
    }

    private static int Factorial(int input) {
        if(input==0)
            return 1;
        else return (input*Factorial(input-1));
    }
}
