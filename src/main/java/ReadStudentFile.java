import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStudentFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name to read: ");
        String fileName = input.nextLine();

        try (Scanner fileInput = new Scanner(new File(fileName));) {
            System.out.println("\nFile Content:\n");
            while (fileInput.hasNext()) {
                String line = fileInput.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        input.close();
    }
}