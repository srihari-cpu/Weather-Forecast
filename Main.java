import java.util.Random;
import java.util.Scanner;

class WeatherForecast {
    private static final String[] WEATHER_CONDITIONS = {
            "sunny", "rainy", "cloudy", "windy", "snowy", "foggy", "thunderstorm"
    };

    public String getRandomForecast() {
        Random random = new Random();
        int index = random.nextInt(WEATHER_CONDITIONS.length);
        return WEATHER_CONDITIONS[index];
    }
}

class WeatherApp {

    private WeatherForecast weatherForecast;

    public WeatherApp() {
        // Initialize the WeatherForecast object
        this.weatherForecast = new WeatherForecast();
    }

    // Method to start the app and get the user's input
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Weather Forecast Simulator!");

        // Loop to keep the program running until the user exits
        while (true) {
            System.out.print("Enter the name of your city (or type 'exit' to quit): ");
            String city = scanner.nextLine();

            // Check if the user wants to exit
            if (city.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            // Get the random weather forecast for the entered city
            String forecast = weatherForecast.getRandomForecast();

            // Display the forecast
            System.out.println("The weather in " + city + " today is " + forecast + ".\n");
        }
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherApp app = new WeatherApp();
        app.start();
    }
}
