package AtCoder;

import java.util.Scanner;

public class Exponentialabc238_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (int)Math.pow(2,n);
        //System.out.println(a);
        int b = n*n;
        //System.out.println(b);
       // int c = (int)Math.pow(n,2);
      //  System.out.println(c);
        if(a>b){
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
}
