// This program calculates the sum of all the multiples of 3 or 5 below
// a given limit number.
import java.util.Scanner;

public class sumOfMultiplesOfThreeAndFive {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the limit number?");
        int limit = Integer.valueOf(scan.nextLine());
        int finalSum = 0;
        
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0 ) {
                finalSum += i;
            }
        }
        System.out.println(finalSum);
        
    }   
}
