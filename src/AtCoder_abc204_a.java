import java.util.Scanner;

public class AtCoder_abc204_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        if((x==0&&y==0)||(x==2&&y==1)||(x==1&&y==2))
            System.out.println(0);
        else if ((x==2&&y==2)||(x==0&&y==1)||(x==1&&y==0))
            System.out.println(2);
        else System.out.println(1);
    }
}
