package Homeworks.Lesson1Hw2;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
    
        int number = scanner.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total +=i;
            }
        }

        if (total == number) {
            System.out.println("Your number is a perfect number");
        } else {
            System.out.println("Your number is not a perfect number");

        }
        scanner.close();
    }
}
