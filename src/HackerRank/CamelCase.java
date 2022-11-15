package HackerRank;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        camelcase(input);
        System.out.println(camelcase(input));
    }

    private static int camelcase(String input) {
        int result=0;
        int stringLength = input.length();
        char[] arr=input.toCharArray();
        int countN=0;
        for (int i=0;i<stringLength;i++ ){
            if(Character.isUpperCase(arr[i])){
                countN++;
            }

        }
        return countN+1;
    }
}
