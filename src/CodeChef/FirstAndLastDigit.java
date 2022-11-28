package CodeChef;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int in = sc.nextInt();
            while (in > 0) {
                int reminder = in % 10;
                list.add(reminder);
                in = in / 10;
            }


            System.out.println(list.get(0) + list.get(list.size() - 1));


        }

    }
}