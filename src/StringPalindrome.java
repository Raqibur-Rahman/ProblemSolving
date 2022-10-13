import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        int length = str.length();
        int j = 0;
        char newArr[] = new char[length];
        for (int i = length - 1; i >= 0; i--) {
            newArr[j] = arr[i];
            j++;
        }
        boolean result = true;
        int count=0;
        for (int i = 0; i<length; i++) {
            if(arr[i]!=newArr[i]){
                result=false;
                count++;
            }
        }
        if (result){
            System.out.println(count/2);//"Palindrome.\n"
        }else System.out.println(count/2);//"Not a palindrome.\n"+


    }
}
