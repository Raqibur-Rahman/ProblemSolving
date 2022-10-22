package AtCoder;

import java.util.Scanner;

public class abc164_a_SheepandWolves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int w= sc.nextInt();
        if(w>=s){
            System.out.println("unsafe");
        }
        else System.out.println("safe");
    }
}
