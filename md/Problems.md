# ☕ Java Beginner Problem Statements
### BSIT — Organized by Topic

---

## 📁 01_Basics

---

### Problem 1: Personal Info Display
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
```

---

### Problem 2: Temperature Converter
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
```

---

### Problem 3: Circle Area Calculator
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
Circumference: 31.42
```

---

### Problem 4: Simple Receipt Printer
**Description:** Simulate a store receipt.

**Instructions:**
1. Declare variables: `String item`, `int quantity`, `double price`
2. Compute `total = quantity * price`
3. Print a formatted receipt with item, quantity, price, and total
4. Add a `String storeName` at the top of the receipt
5. *(Bonus)* Add tax (12%) and print the amount after tax

**Sample Output:**
```
===== Juan's Store =====
Item     : Notebook
Quantity : 3
Price    : ₱25.00
Total    : ₱75.00
========================
```

---

### Problem 5: Data Type Explorer
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
long    : 9876543210
```

---

## 📁 02_Operators

---

### Problem 1: Arithmetic Operations
**Description:** Perform all basic operations on two numbers.

**Instructions:**
1. Ask the user to input two numbers using `Scanner`
2. Compute: addition, subtraction, multiplication, division, and modulo
3. Print all five results in labeled format
4. Use `double` to handle decimal division
5. *(Bonus)* Also print the result of integer division separately

**Sample Output:**
```
Enter two numbers: 10 3
Addition       : 13.0
Subtraction    : 7.0
Multiplication : 30.0
Division       : 3.33
Modulo         : 1.0
```

---

### Problem 2: BMI Calculator
**Description:** Calculate Body Mass Index.

**Instructions:**
1. Ask the user to input `weight` (kg) and `height` (meters)
2. Use formula: `bmi = weight / (height * height)`
3. Print the BMI value with 2 decimal places
4. Use relational operators to classify: Underweight / Normal / Overweight
5. *(Bonus)* Display the healthy weight range for their height

**Sample Output:**
```
Weight: 60 kg
Height: 1.65 m
BMI: 22.04
Category: Normal
```

---

### Problem 3: Logical Operator Checker
**Description:** Check multiple conditions using logical operators.

**Instructions:**
1. Ask the user to input their `age` and `gwa`
2. Use `&&` to check if age >= 18 AND gwa >= 1.0 AND gwa <= 3.0
3. Print `"Eligible for scholarship"` if both conditions are true
4. Use `||` to check if either condition fails and print a message
5. *(Bonus)* Add a third condition: `boolean isEnrolled`

**Sample Output:**
```
Age: 20
GWA: 1.75
Result: Eligible for scholarship
```

---

### Problem 4: Increment and Decrement Demo
**Description:** Demonstrate how `++` and `--` work.

**Instructions:**
1. Declare `int counter = 0`
2. Print the value before and after using `counter++`
3. Print the value before and after using `++counter`
4. Do the same for `counter--` and `--counter`
5. *(Bonus)* Show the difference between prefix and postfix in a table format

**Sample Output:**
```
counter++  : 0 (then becomes 1)
++counter  : 2
counter--  : 2 (then becomes 1)
--counter  : 0
```

---

### Problem 5: Simple Interest Calculator
**Description:** Compute simple interest using operators.

**Instructions:**
1. Ask the user to input: `principal`, `rate` (%), and `time` (years)
2. Use formula: `interest = (principal * rate * time) / 100`
3. Compute total amount: `total = principal + interest`
4. Print principal, interest, and total amount
5. *(Bonus)* Show how the interest grows each year using a loop

**Sample Output:**
```
Principal : ₱10,000.00
Rate      : 5%
Time      : 3 years
Interest  : ₱1,500.00
Total     : ₱11,500.00
```

---

## 📁 03_Conditionals

---

### Problem 1: Voting Eligibility Checker
**Description:** Check if a person is eligible to vote.

**Instructions:**
1. Ask the user to input their `age`
2. Use `if-else` to check if age >= 18
3. Print `"You are eligible to vote"` or `"You are not eligible to vote"`
4. *(Bonus)* Also check if age is valid (not negative or over 120)

**Sample Output:**
```
Enter your age: 20
You are eligible to vote.
```

---

### Problem 2: Day of the Week
**Description:** Display the day name based on a number.

**Instructions:**
1. Ask the user to input a number 1–7
2. Use a `switch` statement where 1 = Monday, 2 = Tuesday, etc.
3. Print the corresponding day name
4. Add a `default` case for invalid inputs
5. *(Bonus)* Also print if it's a weekday or weekend

**Sample Output:**
```
Enter a number (1-7): 6
Saturday — Weekend
```

---

### Problem 3: Triangle Type Checker
**Description:** Determine what type of triangle three sides form.

**Instructions:**
1. Ask the user to input three sides: `a`, `b`, `c`
2. First check if they form a valid triangle: `a+b > c`, `a+c > b`, `b+c > a`
3. If valid, use `if-else if` to check:
   - All sides equal → Equilateral
   - Two sides equal → Isosceles
   - No sides equal → Scalene
4. Print the triangle type
5. *(Bonus)* Also check if it's a right triangle using the Pythagorean theorem

**Sample Output:**
```
Enter sides: 5 5 5
Triangle Type: Equilateral
```

---

### Problem 4: Ticket Price System
**Description:** Compute ticket price based on age category.

**Instructions:**
1. Ask the user to input their age
2. Use `if-else if-else` to assign price:
   - Age 0–3 → Free
   - Age 4–12 → ₱50
   - Age 13–59 → ₱100
   - Age 60+ → ₱75 (Senior)
3. Print the category and ticket price
4. *(Bonus)* Ask how many tickets and compute the total

**Sample Output:**
```
Enter age: 65
Category : Senior Citizen
Price    : ₱75.00
```

---

### Problem 5: Login System Simulator
**Description:** Simulate a basic username and password login.

**Instructions:**
1. Declare `String correctUser = "admin"` and `String correctPass = "1234"`
2. Ask the user to input a username and password
3. Use `if` with `.equals()` to compare strings
4. Print `"Login Successful"` or `"Invalid Credentials"`
5. *(Bonus)* Use a loop to allow 3 attempts before locking out

**Sample Output:**
```
Username: admin
Password: 1234
Login Successful! Welcome, admin.
```

---

## 📁 04_Loops

---

### Problem 1: Number Pyramid
**Description:** Print a pyramid pattern using loops.

**Instructions:**
1. Ask the user to input the number of rows
2. Use a nested `for` loop: outer loop for rows, inner loop for printing `*`
3. Print one more `*` per row (row 1 = one star, row 2 = two stars, etc.)
4. Make sure each row is on a new line
5. *(Bonus)* Center-align the pyramid using spaces

**Sample Output:**
```
*
**
***
****
*****
```

---

### Problem 2: FizzBuzz
**Description:** Classic programming exercise using loops and conditions.

**Instructions:**
1. Use a `for` loop from 1 to 100
2. If the number is divisible by 3, print `"Fizz"`
3. If divisible by 5, print `"Buzz"`
4. If divisible by both 3 and 5, print `"FizzBuzz"`
5. Otherwise, print the number itself

**Sample Output:**
```
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz ...
```

---

### Problem 3: Guessing Game
**Description:** Create a number guessing game using a loop.

**Instructions:**
1. Declare a secret number: `int secret = 42`
2. Use a `while` loop that keeps running until the user guesses correctly
3. Ask the user to input a guess each loop
4. Print `"Too High"`, `"Too Low"`, or `"Correct!"` accordingly
5. *(Bonus)* Count the number of attempts and display it at the end

**Sample Output:**
```
Guess the number: 50
Too High!
Guess the number: 30
Too Low!
Guess the number: 42
Correct! You got it in 3 attempts.
```

---

### Problem 4: Reverse a Number
**Description:** Reverse the digits of a number using a loop.

**Instructions:**
1. Ask the user to input a positive integer
2. Use a `while` loop with modulo `%` and division `/` to extract digits
3. Build the reversed number inside the loop
4. Print the original and reversed number
5. *(Bonus)* Check if the number is a palindrome (same forwards and backwards)

**Sample Output:**
```
Enter a number: 12345
Reversed: 54321
Not a palindrome.
```

---

### Problem 5: ATM Simulator
**Description:** Simulate a simple ATM machine using a loop.

**Instructions:**
1. Declare `double balance = 5000.00`
2. Use a `do-while` loop to show a menu: Deposit / Withdraw / Check Balance / Exit
3. Ask the user to choose an option using `Scanner`
4. Update balance accordingly and print confirmation
5. Prevent withdrawal if balance is insufficient
6. *(Bonus)* Keep a transaction history using a counter

**Sample Output:**
```
===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Choose: 3
Your balance: ₱5,000.00
```

---

## 📁 05_Arrays

---

### Problem 1: Student Grades Tracker
**Description:** Store and display student grades using an array.

**Instructions:**
1. Declare an `int[] grades` array with 5 elements
2. Ask the user to input 5 grades using a `for` loop and `Scanner`
3. Print all grades using another `for` loop
4. Compute and print the average
5. *(Bonus)* Find and print the highest and lowest grade

**Sample Output:**
```
Enter grade 1: 88
Enter grade 2: 92
Enter grade 3: 78
Enter grade 4: 95
Enter grade 5: 85
Average: 87.6 | Highest: 95 | Lowest: 78
```

---

### Problem 2: Array Sorter
**Description:** Sort an array of numbers in ascending order.

**Instructions:**
1. Declare and initialize an `int[]` array with 6 unsorted numbers
2. Print the original array
3. Use `Arrays.sort()` to sort the array
4. Print the sorted array
5. *(Bonus)* Manually implement bubble sort without using `Arrays.sort()`

**Sample Output:**
```
Original : [5, 2, 8, 1, 9, 3]
Sorted   : [1, 2, 3, 5, 8, 9]
```

---

### Problem 3: Search in an Array
**Description:** Find if a number exists in an array.

**Instructions:**
1. Declare an `int[]` array with 8 random numbers
2. Ask the user to input a number to search for
3. Use a `for` loop to check each element
4. Print `"Found at index X"` or `"Not found"`
5. *(Bonus)* Count how many times the number appears in the array

**Sample Output:**
```
Array: [4, 7, 2, 9, 4, 1, 6, 4]
Search for: 4
Found at index 0, 4, 7
Appears 3 time(s).
```

---

### Problem 4: 2D Array Grade Table
**Description:** Use a 2D array to store grades of multiple students.

**Instructions:**
1. Declare a `int[][] grades = new int[3][3]` (3 students, 3 subjects)
2. Use nested loops to ask the user to input each grade
3. Use nested loops again to print the grades in a table format
4. Compute and print the average grade per student
5. *(Bonus)* Find which student has the highest overall average

**Sample Output:**
```
         Math  English  Science
Student 1:  88     90      85    | Avg: 87.67
Student 2:  75     80      78    | Avg: 77.67
Student 3:  92     88      95    | Avg: 91.67
Top Student: Student 3
```

---

### Problem 5: Inventory System
**Description:** Manage a simple product inventory using parallel arrays.

**Instructions:**
1. Declare three arrays: `String[] products`, `int[] quantity`, `double[] price`
2. Pre-fill them with 4 items of your choice
3. Use a `for` loop to display all items in a formatted table
4. Compute and print the total inventory value: `quantity * price` per item
5. *(Bonus)* Ask the user to search for a product by name and display its details

**Sample Output:**
```
Product       Qty    Price     Total
Notebook       10   ₱25.00   ₱250.00
Ballpen        50    ₱5.00   ₱250.00
Folder         20   ₱15.00   ₱300.00
Eraser         30    ₱3.00    ₱90.00
Total Inventory Value: ₱890.00
```

---

> 💡 **Tips:**
> - Always import `java.util.Scanner` for user input
> - Name your `.java` files using PascalCase (e.g., `GradeTracker.java`)
> - Test with different inputs including edge cases
> - One program per `.java` file
> - Don't hesitate to ask for hints! 🚀