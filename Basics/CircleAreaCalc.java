/*### Problem 3: Circle Area Calculator
**Description:** Compute the area of a circle.

**Instructions:**
1. Declare `double radius` and assign a value
2. Use `Math.PI` for the value of pi
3. Apply the formula: `area = Math.PI * radius * radius`
4. Print the result with 2 decimal places using `printf`
5. *(Bonus)* Also compute the circumference: `2 * Math.PI * radius`

**Sample Output:**
```
Radius: 5.0
Area: 78.54
Circumference: 31.42 */
public class CircleAreaCalc {
    public static void main(String[] args) {

        double radius = 5.0;
        double pi = Math.PI;
        
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;
 
        System.out.printf("Radius: %.2f\nArea: %.2f\nCircumference: %.2f", radius, area, circumference);

    }
    
}
