package Homeworks.Lesson2Hw2.LearningClasses.RecapClasses;

public class BasicCalculator {
    
    public int summation(int num1,int num2){
        return num1+num2;
    }
    //Method Overloading
    public int summation(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    //Method Overloading
    public int summation(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

    public int substraction(int num1,int num2){
        return num1-num2;    
    }

    public int multiplication(int num1,int num2){
        return num1*num2;    
    }

    public int division(int num1,int num2){
        return num1/num2;   
    }
}
