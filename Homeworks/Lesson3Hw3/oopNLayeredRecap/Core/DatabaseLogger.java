package Homeworks.Lesson3Hw3.oopNLayeredRecap.Core;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
        
    }
    
}
