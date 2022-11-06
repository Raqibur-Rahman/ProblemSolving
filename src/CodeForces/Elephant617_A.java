package CodeForces;

import java.util.Scanner;

public class Elephant617_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int total;

        int fifthSubTotal = in/5;
        int fifthReminder = in%5;

        total=fifthSubTotal;

        int fourthSubTotal=fifthReminder/4;
        int fourthReminder = fifthReminder%4;

        total=total+fourthSubTotal;

        int thirdSubTotal = fourthReminder/3;
        int thirdReminder = fourthReminder%3;

        total = total+thirdSubTotal;

        int secondSubTotal = thirdReminder/2;
        int secondReminder = thirdReminder%2;

        total =total+secondSubTotal;

        total = total+ secondReminder;

        System.out.println(total);

    }
}
