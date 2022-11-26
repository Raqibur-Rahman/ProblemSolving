package CodeChef;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        while (tc-->0){
            int in=sc.nextInt();
            int count = 0;
            while (in>0){
                int reminder=in%10;
                if(reminder==4){
                    count++;
                }
                in=in/10;
            }
            System.out.println(count);

        }

    }
}