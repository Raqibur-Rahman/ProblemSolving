import java.util.Scanner;

public class ReverseString {
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
        for (int i = 0; i<length; i++) {
            System.out.print(newArr[i]);
        }

    }
}
