package CodeChef;

import java.util.ArrayList;
import java.util.Scanner;

public class EnormousInputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] array=new int[n];
        int count=0;
        for (int i=0;i<n;i++){
           array[i]=sc.nextInt();
           if(array[i]%k==0){
               count++;
           }
        }

        System.out.println(count);
    }
}
