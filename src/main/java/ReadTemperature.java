import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadTemperature {

    public static void main(String[] args) {
        try (DataInputStream in = new DataInputStream(new FileInputStream("temperature.dat"))) {
            System.out.println("File has been opened");

            int counter = 1;

            while (in.available() > 0) {
                System.out.println("\nCity #" + counter);

                String cityName = in.readUTF();
                double temperature = in.readDouble();

                System.out.println("City name: " + cityName);
                System.out.println("Temperature: " + temperature);

                counter++;
            }

            System.out.println("\nAll Temperature Records have been read");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
