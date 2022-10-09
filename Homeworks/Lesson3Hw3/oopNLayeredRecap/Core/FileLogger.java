package Homeworks.Lesson3Hw3.oopNLayeredRecap.Core;

public class FileLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı : " + data);
        
    }
    
}
