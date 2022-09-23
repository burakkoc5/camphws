package Homeworks.Lesson2Hw2.LearningClasses.RecapClasses;

public class Main {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        int result = basicCalculator.summation(3, 4);
        result = basicCalculator.summation(3, 4, 5);
        result = basicCalculator.summation(3, 4, 5,6);
        System.out.println(result);
        
    }
    
}
