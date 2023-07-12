package IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Backup {
    private String pathDir;

    public Backup(String pathDir) {
        this.pathDir = pathDir;
    }

    private final String BACKUP = "C:\\Users\\prist\\OneDrive\\Рабочий стол\\Java Core\\Лекция 5\\lesson_05\\backup";

    public void copy() throws IOException {
        File dir = new File(pathDir);
        Path pathFrom = Paths.get(dir.getPath());
        File backup = new File(BACKUP);
        Path pathTo = Paths.get(backup.getPath());
        if (!backup.exists()) {
            Path backupDir = Files.createDirectories(Paths.get(backup.toURI()));
            System.out.printf("Directory created " + backupDir.toString());
        }
        System.out.println();
        File[] files = dir.listFiles();
        for (File file : files) {
            Files.copy(pathFrom, pathTo, REPLACE_EXISTING);
            System.out.println("File copied " + file.getName());
        }
    }
}