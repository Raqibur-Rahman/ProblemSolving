import java.util.Scanner;

public class AtCoder_abc203_a {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
       if(a==b||a==c|b==c){
           if(a==b)
               System.out.println(c);
           else if(a==c)
               System.out.println(b);
           else
               System.out.println(a);
       }
       else System.out.println(0);
    }
}
