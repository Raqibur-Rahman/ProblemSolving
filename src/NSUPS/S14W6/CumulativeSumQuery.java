package NSUPS.S14W6;

import java.util.Scanner;

public class CumulativeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        int l=a.length;
        for (int i =0;i<l;i++){
            a[i]=sc.nextInt();
        }

        int q = sc.nextInt();
        for (int i =0;i<q;i++){
            int x=sc.nextInt(), y=sc.nextInt();
            System.out.println(sumOfArrayByIndex(a,x,y));
        }

    }

    private static int sumOfArrayByIndex(int array[], int firstIndex, int lastIndex) {
        int sum=0;
        for (int i=firstIndex;i<=lastIndex;i++){
            sum=sum+array[i];
        }
        return sum;
    }
}
