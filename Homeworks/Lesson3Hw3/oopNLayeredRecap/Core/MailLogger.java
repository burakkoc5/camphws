package Homeworks.Lesson3Hw3.oopNLayeredRecap.Core;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Maile loglandı : " + data);
        
    }
}
