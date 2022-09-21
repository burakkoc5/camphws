package Lessons.Lesson1Hw2;

import java.util.Scanner;

public class NumberFinder {
    public static void main(String[] args) {
		int[] numbers=new int[] {1,2,3,5,7,9,0};
		Scanner scanner =new Scanner(System.in);
		int wantedNumber = 9;
        boolean isExist=false;

		while(true) {
			for(int number:numbers) {
				if(number==wantedNumber) {
					isExist=true;
					break;
				}
			}	
			break;
		}
		if(isExist) {
            System.out.println("You have at least 1 prime number in your array");
        }
        else {
            System.out.println("There are no prime numbers");
        }	

        scanner.close();
        
		
	}  
}
