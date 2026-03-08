/*### Problem 2: Temperature Converter
**Description:** Convert Celsius to Fahrenheit.

**Instructions:**
1. Declare a `double celsius` variable and assign a value
2. Use the formula: `fahrenheit = (celsius * 9/5) + 32`
3. Print both values in a formatted output
4. *(Bonus)* Ask the user for input using `Scanner`

**Sample Output:**
```
Celsius: 37.0
Fahrenheit: 98.6
``` */
public class TemperatureConverter {
    public static void main(String[] args){

        double celsius = 35.2;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Celcius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

    }
}
