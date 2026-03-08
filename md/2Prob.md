# ☕ Java Problem Statements — Level Up Topics
### BSIT — Topics 06 to 10

---

## 📁 06_Methods

---

### Problem 1: Unit Converter
**Description:** Create a program with methods that convert units.

**Instructions:**
1. Create a method `kmToMiles(double km)` that returns the converted value
2. Create a method `kgToPounds(double kg)` that returns the converted value
3. Create a method `celsiusToFahrenheit(double c)` that returns the converted value
4. Call all three methods from `main` and print the results
5. *(Bonus)* Add a reverse conversion method for each

**Sample Output:**
```
5.0 km = 3.11 miles
70.0 kg = 154.32 lbs
37.0°C = 98.6°F
```

---

### Problem 2: Number Utilities
**Description:** Build a set of utility methods for numbers.

**Instructions:**
1. Create `isEven(int n)` — returns `true` if even
2. Create `isPrime(int n)` — returns `true` if prime
3. Create `factorial(int n)` — returns the factorial value
4. Create `power(int base, int exp)` — returns base raised to exp
5. Call and test all methods in `main` with different inputs

**Sample Output:**
```
isEven(4)      : true
isPrime(7)     : true
factorial(5)   : 120
power(2, 8)    : 256
```

---

### Problem 3: String Utilities
**Description:** Create helper methods for String manipulation.

**Instructions:**
1. Create `countVowels(String s)` — counts vowels in a string
2. Create `reverseString(String s)` — returns the reversed string
3. Create `isPalindrome(String s)` — returns true if palindrome
4. Create `capitalize(String s)` — capitalizes first letter of each word
5. Test all methods in `main` using `Scanner` input

**Sample Output:**
```
Input         : "hello world"
Vowels        : 3
Reversed      : "dlrow olleh"
isPalindrome  : false
Capitalized   : "Hello World"
```

---

### Problem 4: Grade Calculator
**Description:** Build a grade computation system using methods.

**Instructions:**
1. Create `getAverage(int[] grades)` — returns the average
2. Create `getHighest(int[] grades)` — returns the highest grade
3. Create `getLowest(int[] grades)` — returns the lowest grade
4. Create `getRemarks(double avg)` — returns Passed or Failed
5. Call all methods and display a complete grade report

**Sample Output:**
```
Grades  : [88, 92, 78, 95, 85]
Average : 87.6
Highest : 95
Lowest  : 78
Remarks : Passed
```

---

### Problem 5: Simple Math Menu
**Description:** Create a method-based math menu program.

**Instructions:**
1. Create separate methods for: `add`, `subtract`, `multiply`, `divide`
2. Each method takes two `double` parameters and returns a `double`
3. In `main`, show a menu and ask the user to choose an operation
4. Call the appropriate method based on the user's choice
5. *(Bonus)* Loop the menu until the user chooses to exit

**Sample Output:**
```
===== MATH MENU =====
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Choose: 1
Enter two numbers: 10 5
Result: 10.0 + 5.0 = 15.0
```

---

## 📁 07_OOP

---

### Problem 1: Student Class
**Description:** Create a class to represent a student.

**Instructions:**
1. Create a `Student` class with fields: `name`, `age`, `course`, `gwa`
2. Add a constructor that accepts all four fields
3. Add a method `displayInfo()` that prints all details
4. Add a method `isHonorStudent()` that returns true if gwa <= 1.75
5. In `main`, create 2 Student objects and call their methods

**Sample Output:**
```
Name    : Juan Dela Cruz
Age     : 19
Course  : BSIT
GWA     : 1.50
Honor Student: Yes
```

---

### Problem 2: Bank Account
**Description:** Simulate a bank account using OOP.

**Instructions:**
1. Create a `BankAccount` class with fields: `owner`, `accountNumber`, `balance`
2. Add methods: `deposit(double amount)`, `withdraw(double amount)`, `getBalance()`
3. In `withdraw`, check if balance is sufficient before deducting
4. Add a `displayInfo()` method showing account details
5. *(Bonus)* Add a transaction counter that increments on every deposit/withdraw

**Sample Output:**
```
Owner   : Maria Santos
Account : 00123456
Balance : ₱5,000.00
Deposited ₱1,000.00 | New Balance: ₱6,000.00
Withdrew  ₱500.00   | New Balance: ₱5,500.00
```

---

### Problem 3: Rectangle Calculator
**Description:** Model a rectangle using a class.

**Instructions:**
1. Create a `Rectangle` class with fields: `length` and `width`
2. Add a constructor to initialize both fields
3. Add methods: `getArea()`, `getPerimeter()`, `isSquare()`
4. `isSquare()` returns true if length equals width
5. In `main`, create 3 Rectangle objects with different dimensions and display all results

**Sample Output:**
```
Rectangle 1: 5 x 3
Area      : 15
Perimeter : 16
Is Square : No

Rectangle 2: 4 x 4
Area      : 16
Perimeter : 16
Is Square : Yes
```

---

### Problem 4: Simple Inventory Item
**Description:** Use OOP to model a store product.

**Instructions:**
1. Create a `Product` class with: `name`, `price`, `quantity`
2. Add a constructor and a `displayInfo()` method
3. Add `restock(int amount)` — increases quantity
4. Add `sell(int amount)` — decreases quantity, check if stock is enough
5. In `main`, create 2 products, restock one, sell from another, and display both

**Sample Output:**
```
Product : Notebook | Price: ₱25.00 | Qty: 10
Restocked 20 units | New Qty: 30
Sold 5 units       | New Qty: 25
Insufficient stock!
```

---

### Problem 5: Animal Class with Inheritance
**Description:** Practice basic inheritance.

**Instructions:**
1. Create a parent class `Animal` with fields `name` and `sound`, and a method `speak()`
2. Create a child class `Dog` that extends `Animal` and adds a method `fetch()`
3. Create a child class `Cat` that extends `Animal` and adds a method `purr()`
4. Override `speak()` in both child classes to print custom messages
5. In `main`, create one `Dog` and one `Cat` object and call all their methods

**Sample Output:**
```
Dog: Buddy says Woof!
Buddy fetches the ball!

Cat: Kitty says Meow!
Kitty is purring...
```

---

## 📁 08_Strings

---

### Problem 1: String Inspector
**Description:** Analyze the properties of a string.

**Instructions:**
1. Ask the user to input a sentence using `Scanner`
2. Print the total character count using `.length()`
3. Print the string in uppercase and lowercase
4. Count and print the number of spaces (words - 1)
5. *(Bonus)* Count how many times each vowel appears

**Sample Output:**
```
Input      : "Hello World"
Length     : 11
Uppercase  : HELLO WORLD
Lowercase  : hello world
Spaces     : 1
Vowels     : e=1, o=2
```

---

### Problem 2: Word Reverser
**Description:** Reverse words in a sentence.

**Instructions:**
1. Ask the user to input a sentence
2. Use `.split(" ")` to break it into words
3. Use a loop to reverse the order of the words
4. Print the sentence with words in reversed order
5. *(Bonus)* Also reverse each individual word's letters

**Sample Output:**
```
Input    : "Java is fun"
Reversed : "fun is Java"
Bonus    : "avaJ si nuF"
```

---

### Problem 3: Caesar Cipher
**Description:** Encode a message by shifting letters.

**Instructions:**
1. Ask the user to input a message and a shift number (e.g., 3)
2. Loop through each character using `.charAt(i)`
3. Shift each letter by the given number (wrap around Z to A)
4. Print the encoded message
5. *(Bonus)* Add a decode option that shifts in the opposite direction

**Sample Output:**
```
Message  : "Hello"
Shift    : 3
Encoded  : "Khoor"
Decoded  : "Hello"
```

---

### Problem 4: Username Validator
**Description:** Validate a username based on rules.

**Instructions:**
1. Ask the user to input a username
2. Check that it is 6–15 characters long
3. Check that it starts with a letter using `Character.isLetter()`
4. Check that it contains no spaces
5. Print `"Valid username"` or list which rules were violated

**Sample Output:**
```
Input: "1juan"
✗ Must start with a letter
✓ Length is valid
✓ No spaces
Result: Invalid username
```

---

### Problem 5: Word Frequency Counter
**Description:** Count how many times a word appears in a sentence.

**Instructions:**
1. Ask the user to input a sentence
2. Ask the user to input a word to search for
3. Use `.split(" ")` and loop through the words
4. Count how many times the search word appears (case-insensitive)
5. *(Bonus)* List all unique words and their frequency count

**Sample Output:**
```
Sentence : "the cat sat on the mat by the cat"
Search   : "the"
Count    : 3

Word Frequency:
the=3, cat=2, sat=1, on=1, mat=1, by=1
```

---

## 📁 09_Exception_Handling

---

### Problem 1: Safe Division
**Description:** Handle division by zero using try-catch.

**Instructions:**
1. Ask the user to input two numbers
2. Wrap the division in a `try` block
3. Catch `ArithmeticException` and print a friendly error message
4. Use `finally` to print `"Calculation complete"` regardless
5. *(Bonus)* Loop until the user enters a valid non-zero denominator

**Sample Output:**
```
Enter two numbers: 10 0
Error: Cannot divide by zero!
Calculation complete.

Enter two numbers: 10 2
Result: 5.0
Calculation complete.
```

---

### Problem 2: Safe Number Input
**Description:** Handle invalid number input from the user.

**Instructions:**
1. Ask the user to input an integer
2. Wrap the input in a `try` block
3. Catch `InputMismatchException` if the user types letters instead of numbers
4. Print an error message and ask them to try again
5. Use a `while` loop to keep asking until valid input is given

**Sample Output:**
```
Enter a number: abc
Error: Please enter a valid number!
Enter a number: 42
You entered: 42
```

---

### Problem 3: Array Index Guard
**Description:** Prevent array out-of-bounds errors.

**Instructions:**
1. Declare an `int[]` array with 5 elements
2. Ask the user to input an index to access
3. Wrap the array access in a `try` block
4. Catch `ArrayIndexOutOfBoundsException` and print a warning
5. *(Bonus)* Also catch `NegativeArraySizeException`

**Sample Output:**
```
Array: [10, 20, 30, 40, 50]
Enter index: 7
Error: Index 7 is out of bounds! Valid range: 0-4

Enter index: 2
Value at index 2: 30
```

---

### Problem 4: Custom Exception
**Description:** Create and throw your own custom exception.

**Instructions:**
1. Create a class `AgeException` that extends `Exception`
2. Add a constructor that accepts a message string
3. In `main`, ask the user for their age
4. If age is below 0 or above 150, throw `AgeException` with a message
5. Catch it in `main` and print the error message

**Sample Output:**
```
Enter age: -5
AgeException: Age cannot be negative!

Enter age: 200
AgeException: Age cannot exceed 150!

Enter age: 20
Age accepted: 20
```

---

### Problem 5: Multi-Catch Handler
**Description:** Handle multiple exception types in one program.

**Instructions:**
1. Ask the user to input two numbers and an array index
2. In a single `try` block: perform division AND access an array element
3. Use separate `catch` blocks for `ArithmeticException` and `ArrayIndexOutOfBoundsException`
4. Add a general `catch(Exception e)` as a fallback
5. Print which specific error occurred and why

**Sample Output:**
```
Enter two numbers: 10 0
Enter array index: 2
Error caught: ArithmeticException — Cannot divide by zero!

Enter two numbers: 10 2
Enter array index: 99
Error caught: ArrayIndexOutOfBoundsException — Index 99 out of range!
```

---

## 📁 10_File_Handling

---

### Problem 1: Write to a File
**Description:** Save user input into a text file.

**Instructions:**
1. Import `java.io.FileWriter` and `java.io.IOException`
2. Ask the user to type a message using `Scanner`
3. Use `FileWriter` to write the message to `output.txt`
4. Print `"File saved successfully"` after writing
5. *(Bonus)* Append to the file instead of overwriting using `FileWriter(file, true)`

**Sample Output:**
```
Enter a message: Hello, this is my first file!
File saved successfully to output.txt
```

---

### Problem 2: Read from a File
**Description:** Read and display contents of a text file.

**Instructions:**
1. Import `java.io.File` and `java.util.Scanner`
2. Create a `File` object pointing to an existing `.txt` file
3. Use `Scanner` to read the file line by line
4. Print each line with a line number prefix (e.g., `1: Hello`)
5. *(Bonus)* Count the total number of lines and words in the file

**Sample Output:**
```
1: Hello, this is my first file!
2: Java file handling is useful.
3: Keep practicing!

Total Lines : 3
Total Words : 13
```

---

### Problem 3: Student Record Saver
**Description:** Save student records into a file.

**Instructions:**
1. Ask the user how many students to enter
2. For each student, ask for name, age, and grade
3. Write each student's data as a line in `students.txt`
4. Format each line like: `Juan, 19, 88`
5. *(Bonus)* Read the file back and display it as a formatted table

**Sample Output:**
```
How many students: 2
Student 1 — Name: Juan | Age: 19 | Grade: 88
Student 2 — Name: Maria | Age: 20 | Grade: 92
Records saved to students.txt

Name     Age   Grade
Juan      19     88
Maria     20     92
```

---

### Problem 4: Word Search in File
**Description:** Search for a keyword inside a file.

**Instructions:**
1. Read the contents of a `.txt` file line by line
2. Ask the user to input a keyword to search for
3. Check each line using `.contains(keyword)`
4. Print all lines that contain the keyword with their line number
5. *(Bonus)* Count and print the total number of matches found

**Sample Output:**
```
Search keyword: Java
Line 2: Java file handling is useful.
Line 5: I love coding in Java.

Matches found: 2
```

---

### Problem 5: File-Based Notes App
**Description:** Build a simple notes manager using files.

**Instructions:**
1. Show a menu: Add Note / View Notes / Delete All / Exit
2. Use a `do-while` loop to keep the menu running
3. "Add Note" appends a new line to `notes.txt`
4. "View Notes" reads and prints all lines from `notes.txt`
5. "Delete All" clears the file by overwriting it with empty content

**Sample Output:**
```
===== NOTES APP =====
1. Add Note
2. View Notes
3. Delete All Notes
4. Exit
Choose: 1
Enter note: Study Java exceptions today
Note saved!

Choose: 2
1: Study Java exceptions today
2: Review OOP concepts
```

---

> 💡 **Tips:**
> - `06_Methods` — Always `return` the correct data type
> - `07_OOP` — Every class goes in its own `.java` file
> - `08_Strings` — Strings are zero-indexed, just like arrays
> - `09_Exception_Handling` — Always close your `Scanner` in `finally`
> - `10_File_Handling` — Always wrap file code in `try-catch` for `IOException`
>
> 🚀 You've got this! Ask anytime if you need hints or code reviews.
