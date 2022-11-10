package CodeForces;

import java.util.Scanner;

public class DislikeofThrees_1560A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc>0){
            int in = sc.nextInt();
            int count = 1;
            for (int i = 1; count <= in; i++) {
                if (i % 3 != 0 && i%10!=3){
                    if(count==in){
                        System.out.println(i);
                    }
                    count++;
                }

            }
            tc--;
        }
    }
}
