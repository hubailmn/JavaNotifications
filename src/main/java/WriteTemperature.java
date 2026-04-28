import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteTemperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of cities: ");
        int cityNum = scanner.nextInt();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("temperature.dat"))) {

            for (int i = 1; i < cityNum + 1; i++) {
                System.out.println("\nCity #" + i);

                System.out.print("Enter City Name: ");
                String cityName = scanner.next();

                System.out.print("Enter Temperature: ");
                double temperature = scanner.nextDouble();

                dos.writeUTF(cityName);
                dos.writeDouble(temperature);

            }

            System.out.println("\nData saved to temperature.dat");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
