package Lessons.Lesson1Hw2;

import java.util.Scanner;

public class FriendNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");

        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");

        int secondNumber = scanner.nextInt();

        int total = 0;
        int total2 = 0;

        for (int i = 1; i < firstNumber; i++) {
            if (firstNumber % i == 0) {
                total += i;
            }
        }

        for (int i = 1; i < secondNumber; i++) {
            if (secondNumber % i == 0) {
                total2 += i;
            }
        }

        if (firstNumber == total2 && secondNumber == total) {
            System.out.println("These 2 numbers are friend numbers");
        } else {
            System.out.println("These 2 numbers are not friend numbers");

        }
        scanner.close();
    }
}
