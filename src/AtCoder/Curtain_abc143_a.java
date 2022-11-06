package AtCoder;

import java.util.Scanner;

public class Curtain_abc143_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int in2 = sc.nextInt();
        if(in>(in2*2)){
            System.out.println(in-(in2*2));
        } else{
            System.out.println(0);
        }
    }
}
