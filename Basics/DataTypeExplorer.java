/*### Problem 5: Data Type Explorer
**Description:** Display the size and example value of different data types.

**Instructions:**
1. Declare one variable of each type: `int`, `double`, `float`, `char`, `boolean`, `long`
2. Assign a sample value to each
3. Print each variable with its type name and value
4. Use `System.out.println` for each line
5. *(Bonus)* Print the max value of `int` using `Integer.MAX_VALUE`

**Sample Output:**
```
int     : 100
double  : 3.14159
float   : 3.14
char    : A
boolean : true
long    : 9876543210 */
public class DataTypeExplorer {
    public static void main(String[] args) {

        int integer = 7; // integer
        double withDecimal = 16.76; // with decimal
        float withF = 7.71f; // always with f after the value
        char oneCharacter = 'A'; // single qoute
        boolean isNice = true; // true or false
        long phoneNum = 910648765; // dapat walang zero
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.printf("""
                    int     : %d
                    double  : %f
                    float   : %f
                    char    : %c
                    boolean : %b
                    long    : %d
                    Max int : %d
                    Min int : %d

                """, integer, withDecimal, withF, oneCharacter, isNice, phoneNum, max, min);
    }

}
