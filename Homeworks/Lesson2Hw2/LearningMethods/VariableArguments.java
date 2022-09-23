package Homeworks.Lesson2Hw2.LearningMethods;


public class VariableArguments {
    public static void main(String[] args) {
        
        int total = sumUp(3,4,5,6,7,8,9,10);
        System.out.println(total);

    }

    //int... numbers means that you may enter as many numbers as you want 
    public static int sumUp(int... numbers){
        int total = 0;
        for (int i : numbers) {
            total+=i;
        }

        return total;
    }


}
