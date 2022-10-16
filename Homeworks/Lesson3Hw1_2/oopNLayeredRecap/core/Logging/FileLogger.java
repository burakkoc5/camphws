package oopNLayeredRecap.core.Logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı: " + data);

    }

}
