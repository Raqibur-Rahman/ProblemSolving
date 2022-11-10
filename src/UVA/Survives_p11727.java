package UVA;

import java.util.Scanner;

public class Survives_p11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i=1;i<=tc;i++){

            int salary1=sc.nextInt(), salary2=sc.nextInt(),salary3=sc.nextInt();
            if((salary1<salary2 && salary2<salary3)||(salary1>salary2 && salary2>salary3)){
                System.out.println("Case "+i+": "+salary2);
            }else if((salary2<salary3 && salary3<salary1)||(salary2>salary3 && salary3>salary1)){
                System.out.println("Case "+i+": "+salary3);
            }
            else System.out.println("Case "+i+": "+salary1);

        }
    }
}
