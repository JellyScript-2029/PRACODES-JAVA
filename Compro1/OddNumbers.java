public class OddNumbers {
    
    public static void main(String[] args) {
    
        printEvenNumbers(10);
    
    }
     public static void printEvenNumbers(int n) {
        for (int i = 0; i <= n; i++) { // loop numbers
            if (i % 2 != 0) {// if it is equal to zero then it is even
                System.out.println(i);
            }
        }
    }
}
