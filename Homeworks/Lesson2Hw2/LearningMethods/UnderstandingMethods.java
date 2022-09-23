package Homeworks.Lesson2Hw2.LearningMethods;

import java.util.Scanner;

public class UnderstandingMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to check its existence in list : ");
        int num = scanner.nextInt();
        numberFinder(num);
        scanner.close();
        
    }

    public static void numberFinder(int wantedNum){
        int[] numbers = new int[]{1,2,5,7,9,0};
        int wanted = wantedNum;

        boolean isExist = false;

        for (int i : numbers) {
            if (i==wanted) {
                isExist = true;
                break;
            }
        }
        giveResultMessage(isExist,wanted);
    }

    public static void giveResultMessage(boolean existence, int wanted){
        if (existence) {
            System.out.println("The list includes the number " + wanted);
        } else {
            System.out.println("The list doesn't includes the number " + wanted);
        }
    }
}
