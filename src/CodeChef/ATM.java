package CodeChef;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(y>=(x+0.5) && x%5==0){
            System.out.println(
                    String.format("%.2f", y-x-0.5));
        }else{
            System.out.println(
                    String.format("%.2f", y));
        }
    }
}
