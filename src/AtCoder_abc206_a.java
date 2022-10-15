import java.util.Scanner;

public class AtCoder_abc206_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = (int) (n*1.08);

        if((result)<206)
            System.out.println("Yay!");
        else if (result==206) {
            System.out.println("so-so");
        }else System.out.println(":(");
    }
}
