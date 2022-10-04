import java.util.Scanner;

import static java.lang.Math.max;


public class A214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;

        for (int i =0; i<=max(n,m);i++){
            for (int j =0;j<=max(n,m);j++){
                if((i*i)+j==n && i+(j*j)==m )
                    c++;
            }

        }

        System.out.println(c);

    }
}
