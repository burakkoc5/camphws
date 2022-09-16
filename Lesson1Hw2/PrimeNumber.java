package Lesson1Hw2;

import java.util.Scanner;

class PrimeNumber{
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        
        number = scanner.nextInt();
        int total = 0;
    
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                total++;
            }
        }
        if (total == 2) {
            System.out.println(number  + "is a prime number");
        } else {
            System.out.println(number  + "is not a prime number");
        }
        
        scanner.close();
    
    }
}


    
