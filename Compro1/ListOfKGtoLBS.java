public class ListOfKGtoLBS {
    public static void main(String[] args) {
    
        System.out.printf("%s \t %s\n", "KILOGRAMS", "POUNDSS");
        for (int i = 1; i <= 199; i+=2){ 
            double pounds = i * 2.2;
            System.out.printf("%d\t \t %.1f\n ", i , pounds);
        }
        System.out.println();   
    }   
}
