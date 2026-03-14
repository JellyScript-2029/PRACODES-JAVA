
public class Methods {
    public static void main(String[] args){ // CALL
        greet("Good morning!");
        average(98,87);
        square (8);
        evenOdd (3);
        name ("Justine");
    }   

    public static void greet(String greet){ // GREETINGS
        System.out.println(greet);
    }
    
    public static void average(int a, int b){ // AVERAGE
        int ave = (a + b ) / 2;
        System.out.println(ave);
    }

    public static void square(int num){ // SQUARE OF A NUMEBR
        int square = num * num;
        System.out.println("The square of " + num + " is " + square);
    }

    public static void evenOdd (int num){ // TELL IF EVEN OR ODD
        if ( num % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
     public static void name(String name){ // GREETINGS WITH NAME 
        System.out.println("Welcome " + name + "!");
     }
    
}



