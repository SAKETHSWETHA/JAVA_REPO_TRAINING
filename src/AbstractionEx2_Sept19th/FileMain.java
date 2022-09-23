package AbstractionEx2_Sept19th;

public class FileMain {
    public static void main(String[] args) {
        FileJpeg file1 = new FileJpeg();
        file1.produce_report();
        file1.open();
        file1.read();
        FilePdf file2 = new FilePdf();
        file2.produce_report();
        file2.open();
        file2.read();
    }
}
