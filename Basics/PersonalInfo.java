/*### Problem 1: Personal Info Display
**Description:** Create a program that stores and displays your personal information.

**Instructions:**
1. Declare variables: `String name`, `int age`, `String course`, `double gwa`
2. Assign values to each variable
3. Print each one in a labeled format like `Name: Juan`
4. Use `\n` or `println` to separate each line
5. *(Bonus)* Add your school name and year level

**Sample Output:**
```
Name: Juan Dela Cruz
Age: 19
Course: BSIT
GWA: 1.75
``` */
public class PersonalInfo{
    public static void main(String[] args) {
        
        String name = "Jhelianne Figuerres";
        int age = 19;
        String course = "BSIT";
        double gwa = 1.00;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("GWA: " + gwa);
        
    }
}