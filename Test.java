package IO;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Backup backup = new Backup("C:\\Users\\prist\\OneDrive\\Рабочий стол\\Java Core\\Лекция 5\\lesson_05\\src\\IO");
        try {
            backup.copy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}