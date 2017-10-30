package Chapter_06;
/*
(Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
Convert from Celsius to Fahrenheit: public static double celsiusToFahrenheit(double celsius)
Convert from Fahrenheit to Celsius  public static double fahrenheitToCelsius(double fahrenheit)
The formula for the conversion is:
    fahrenheit = (9.0 / 5) * celsius + 32
    celsius = (5.0 / 9) * (fahrenheit – 32)
 */
public class Exercise_08 {
    public static void main(String[] args) {

        // print headers
        System.out.printf("%-10s %-15s %1s %15s %10s", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius\n");

        for (double celsius=50, fahrenheit=220;
                    celsius >= 31; celsius--,
                    fahrenheit-=10){
            System.out.printf("%-10.1f %-15.1f %1s %10.1f %12.1f\n",
                    celsius, celsiusToFahrenheit(celsius), "|", fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }

    /** Methods that converts Celsius degrees to Fahrenheit degrees*/
    public static double celsiusToFahrenheit(double celsius){
        return ((9.0 / 5.0) * celsius + 32.0);
    }

    /** Methods that converts Fahrenheit degrees to Celsius degrees*/
    public static double fahrenheitToCelsius(double fahrenheit){
        return ((5.0 / 9.0) * (fahrenheit - 32.0));
    }
}
