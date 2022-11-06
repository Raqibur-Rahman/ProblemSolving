package AtCoder;

import java.util.Scanner;

public class RecursiveFunction_abc273_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        System.out.println(Recursion(in));
    }

    private static int Recursion(int in) {
        if(in==0)
            return 1;
        else return in*Recursion(in-1);
    }
}
