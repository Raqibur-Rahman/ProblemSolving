package CodeForces;

import java.util.Scanner;

public class ProBending103317B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr= new int[n];
        boolean result = true;
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
            if(k>arr[i]!=true){
                result = false;
            }
        }
        if(result){
            System.out.println("Easy Win!");
        }
        else System.out.println("Difficult Loss");
    }
}
