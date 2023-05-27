package BasicsOFJava.PracticePrograms.Basic;

import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {

        double farenheit = (celsius * (9 / 5)) + +32;
        return (farenheit);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius = (fahrenheit - 32) * (5 / 9);
        return (celsius);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");

        double temperature = scanner.nextDouble();

        System.out.println("\n----- Conversion Menu -----");

        System.out.println("1. Celsius to Fahrenheit");

        System.out.println("2. Fahrenheit to Celsius");

        System.out.println("---------------------------");

        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        double convertedTemperature;

        switch (choice) {

            case 1:
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println("The Converted temp in Farenheit : " + convertedTemperature);

                break;

            case 2:
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println("The Converted temp in Celsius : " + convertedTemperature);

                break;

            default:

                System.out.println("Invalid choice!");

                break;

        }

        scanner.close();

    }

}
