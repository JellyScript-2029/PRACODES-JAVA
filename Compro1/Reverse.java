import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        // PROBLEM 1.
        System.out.println(reverse(234));
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(isPalindrome(number));
    }
    
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number) {
        int reverse = (reverse(number));
        return reverse == number;
    }
} 