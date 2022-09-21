package Homeworks.Lesson1Hw2;

import java.util.Scanner;

public class HighOrLowPitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a alphabetic character");
        
        char input = scanner.next().toUpperCase().charAt(0);
        switch (input) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Your char is high pitched voice.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Your char is low pitched voice.");
                break;
            default:
                System.out.println("Your char is consonant");
        }
        scanner.close();
    }

}
