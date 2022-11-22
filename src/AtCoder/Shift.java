package AtCoder;

import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        if(m>=n){
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]-a[i]+" ");
            }

        }
        else {
            for (int p=1;p<=m;p++){

                for (int i = 1; i < n; i++) {
                    a[i - 1] = a[i];
                    if (i == n - 1) {
                        a[n - 1] = 0;
                    }
                }

            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
            }
        }
    }
}
