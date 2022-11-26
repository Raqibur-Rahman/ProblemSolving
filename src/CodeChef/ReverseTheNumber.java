package CodeChef;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        while (tc-->0){
            int in=sc.nextInt();
            int newNumber = 0;
            while (in>0){
                int reminder=in%10;
                newNumber=newNumber*10+reminder;
                in=in/10;
            }
            System.out.println(newNumber);

        }

    }
}