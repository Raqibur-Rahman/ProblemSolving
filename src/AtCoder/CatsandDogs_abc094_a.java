package AtCoder;

import java.util.Scanner;

public class CatsandDogs_abc094_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();

        if(a>c){
            System.out.println("NO");
        }
        else{
            if(a+b<c){
                System.out.println("NO");
            }
            else if(a+b>c||a+b==c){
                System.out.println("YES");
            }
        }
    }
}
