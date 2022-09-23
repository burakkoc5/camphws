package Homeworks.Lesson2Hw2.LearningMethods;

public class MethodsWithParameters {
    public static void main(String[] args) {
        String message = "The weather is sunny today";
        String newMessage = addCityToString(message);
        System.out.println(newMessage);
        int number = sumUp(5,7);
        System.out.println(number);
    }

    public static String addCityToString(String str) {
        return str + " Ankara.";
    }

    public static int sumUp(int num1, int num2) {
        return num1+num2;
    }


}
