// This program calculates the sum of even members of the fibonacci up to 
// an inputted limit
import java.util.ArrayList;
import java.util.Scanner;

public class evenFibonacci {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the limit number?");
        int limit = Integer.valueOf(scan.nextLine());
        ArrayList<Integer> fibonacci = new ArrayList<>();
        // initiating the fibonacci sequence
        fibonacci.add(0);
        fibonacci.add(1);
        updateFib(fibonacci, limit);
        // Here, i is first 3 because 2, the first even number, appears at index
        // 3 anf from then on, even numbers can be found after every two numbers
        // hence the i += 3.
        int evenSum = 0;
        for (int i = 3; i < fibonacci.size(); i += 3) {
            evenSum += fibonacci.get(i);
        }
        System.out.println(evenSum);
    }
    
    // this method is being used to "grow" the fib series up to a limit number
    public static void updateFib(ArrayList<Integer> fib, int limit) {
        int lastIndex = fib.size() - 1;
        for (int i = lastIndex; i <= fib.size()+1; i++) {
            int newFibNo = fib.get(i) + fib.get(i-1);
            if (newFibNo > limit) {
                break;
            }
            fib.add(newFibNo);
        }
    }
}
