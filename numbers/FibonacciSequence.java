import java.util.Scanner;

public class FibonacciSequence{

    public void generateSequence(int n){
        if (n == 0) return;
        if (n == 1) System.out.println(1);
        int first = 1, second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 0; i < n - 2; i ++){
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }

    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        String nStr;
        nStr = user_input.next();

        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        fibonacciSequence.generateSequence(Integer.parseInt(nStr));
    }    
}