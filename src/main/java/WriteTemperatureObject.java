import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteTemperatureObject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of cities: ");
        int cityNum = scanner.nextInt();

        List<TemperatureRecord> temperatureRecords = new ArrayList<>();

        for (int i = 1; i < cityNum + 1; i++) {
            System.out.println("\nCity #" + i);

            System.out.print("Enter City Name: ");
            String cityName = scanner.next();

            System.out.print("Enter Temperature: ");
            double temperature = scanner.nextDouble();

            TemperatureRecord record = new TemperatureRecord(cityName, temperature);
            temperatureRecords.add(record);
        }

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("temperature.dat"))) {

            for (TemperatureRecord record : temperatureRecords) {
                dos.writeUTF(record.getCityName());
                dos.writeDouble(record.getTemperature());
            }

            System.out.println("Data saved to temperature.dat");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
