public class FileTest implements FileSystemTest {

    private String fileName;


    public FileTest(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void add(FileSystemTest fileSystemTest) {
        System.out.println("Impossibile aggiungere, operazione non consentita");
    }

    @Override
    public void delete(FileSystemTest fileSystemTest) {
        System.out.println("Impossibile eliminare, operazione non consentita");
    }

    @Override
    public void print() {
        System.out.println("    -"+ fileName);
    }

    @Override
    public String getName() {
        return fileName;
    }

    @Override
    public String getInfo() {
        return fileName;
    }

    @Override
    public String toString() {
        return "FileTest{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
