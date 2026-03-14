
import java.util.Scanner;
public class InputChecker{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Boolean validInput = false;
        int n = 0;

    
        System.out.print("Enter a number between 1 and 10: ");
        while (!validInput) {
            if (input.hasNextInt()) {
                n = input.nextInt();
                if (n >= 1 && n <= 10) {
                    validInput = true;
                } else {
                    System.out.print("Please enter a number between 1 and 10: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a number between 1 and 10: ");
                input.next(); // Clear the invalid input
            }
        }
        
    }
}


