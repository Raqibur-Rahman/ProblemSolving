package CodeChef;

import java.util.Scanner;

public class ValidTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            if(sc.nextInt()+sc.nextInt()+sc.nextInt()==180){
                System.out.println("YES");
            }else System.out.println("NO");

        }

    }
}
