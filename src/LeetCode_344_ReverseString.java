import java.util.Scanner;

public class LeetCode_344_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char [] arr = input.toCharArray();
        reverseString(arr);
        int length = arr.length;
        for (int i = 0;i<length;i++){
            if (i==0)
                System.out.print("[");
            System.out.print("\""+arr[i]+"\"");
            if(i<length-1)System.out.print(",");
            if(i==length-1) System.out.println("]");

        }

    }

    public static void reverseString(char[]s) {

        int length = s.length;
        int j = length-1;
        int loop = s.length;
        for (int i = 0;i<(loop/2);i++){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }

    }
}
