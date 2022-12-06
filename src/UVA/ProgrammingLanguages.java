package UVA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgrammingLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {

            Set<Integer> input = new HashSet<>();
            for (int i = 0; i < 2; i++) {
                input.add(sc.nextInt());
            }
            Set<Integer> s1 = new HashSet<>();
            for (int i = 0; i < 2; i++) {
                s1.add(sc.nextInt());
            }
            Set<Integer> s2 = new HashSet<>();
            for (int i = 0; i < 2; i++) {
                s2.add(sc.nextInt());
            }
            if (input.equals(s1)) {
                System.out.println(1);
            } else if (input.equals(s2)) {
                System.out.println(2);
            } else System.out.println("0");

        }


    }
}
