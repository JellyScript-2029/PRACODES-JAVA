import java.util.Scanner;
public class Conversion{
    
	public static void main (String[] args){

        //PROBLEM 2.
        System.out.println(celciusToFahrenheit(3.5));
        System.out.println(fahrenheitToCelcius(0.5));
         }

    //PROBLEM 2. 
    public static double celciusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

}

