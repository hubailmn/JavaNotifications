import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentFileLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = input.nextLine();

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine();

        try (PrintWriter output = new PrintWriter(fileName)) {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter name: ");
                String name = input.nextLine();

                System.out.print("Enter ID: ");
                int id = input.nextInt();

                System.out.print("Enter GPA: ");
                double gpa = input.nextDouble();

                input.nextLine();

                output.println(name + " " + id + " " + gpa);

            }
            System.out.println("Data written successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error creating the file.");
        }

        input.close();
    }
}