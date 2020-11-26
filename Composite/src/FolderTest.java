import javafx.scene.control.Alert;

import java.util.ArrayList;

public class FolderTest implements FileSystemTest {

    private String nomeCartella;
    private ArrayList<FileSystemTest> cartella;


    public FolderTest(String nomeCartella) {
        this.nomeCartella = nomeCartella;
        cartella = new ArrayList<>();
    }

    @Override
    public void add(FileSystemTest fileSystemTest) {
        cartella.add(fileSystemTest);
    }

    @Override
    public void delete(FileSystemTest fileSystemTest) {
        cartella.remove(fileSystemTest);
    }

    @Override
    public void print() {
        System.out.println("Cartella: " + nomeCartella);
        for (FileSystemTest fileSystemTest : cartella) {
            fileSystemTest.print();
        }
    }

    public ArrayList<FileSystemTest> getList() {
        return cartella;
    }

    @Override
    public String toString() {
        return "FolderTest{" +
                "nomeCartella='" + nomeCartella + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return nomeCartella;
    }

    @Override
    public String getInfo() {
        for (FileSystemTest fileSystemTest : cartella)
            return fileSystemTest.getInfo();
        return null;
    }



}

