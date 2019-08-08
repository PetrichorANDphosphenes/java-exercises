package org.launchcode.java.demos.java4python;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class Temperature {

    private double fahrenheit;

    public double getFahrenheit() {
        Scanner inp = new Scanner(System.in);
        double fahrenheit = 0;
        System.out.println("Enter a temperature");
        fahrenheit = inp.nextDouble();

        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {

        // Validate that temp isn't lower than the coldest possible temp ("absolute zero")
        if (fahrenheit < -459.67) {
            throw new IllegalArgumentException("Value is below absolute zero");
        }

        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public void setCelsius(double celsius) {
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        setFahrenheit(fahrenheit);
    }



    public static void main(String[] args) {
        Temperature t = new Temperature();
    }

    double salt = getFahrenheit();





}
