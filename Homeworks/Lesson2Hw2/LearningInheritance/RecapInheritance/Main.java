package Homeworks.Lesson2Hw2.LearningInheritance.RecapInheritance;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit(new SoldierCreditManager());
    }
}
