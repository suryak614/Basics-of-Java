import java.util.Scanner;

public class question1 {

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
System.out.print(String.format("%.1f°C = %.1f°F", temperature, convertedTemperature));
break;

case 2:
convertedTemperature = fahrenheitToCelsius(temperature);
System.out.print(String.format("%.1f°F = %.1f°C", temperature, convertedTemperature));
break;

default:

System.out.println("Invalid choice!");

break;

}

scanner.close();

}

public static double celsiusToFahrenheit(double celsius) {
    double fahrn = (celsius*1.8)+32;
    return fahrn;
}

public static double fahrenheitToCelsius(double fahrenheit) {
    double cel =(fahrenheit-32)/1.8;
    return cel;

}

}