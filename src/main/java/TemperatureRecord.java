import java.io.Serializable;

public class TemperatureRecord implements Serializable {
    private String cityName;
    private double temperature;

    public TemperatureRecord(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "City: " + cityName + "\nTemperature: " + temperature;
    }
}