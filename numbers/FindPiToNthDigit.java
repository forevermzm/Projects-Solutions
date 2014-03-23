import java.io.*;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FindPiToNthDigit{
    private static final int LIMIT_OF_N = 100;
    private static final long TYLOR_VALUE = 99999999;


    public void findPiToNthDigit(int n){
        if (n > LIMIT_OF_N)
            n = LIMIT_OF_N;
        BigDecimal four = new BigDecimal(4.0);
        BigDecimal pi = BigDecimal.ZERO;
        for (long i = 0;  i < TYLOR_VALUE; i ++){
            BigDecimal divider = new BigDecimal(2 * i + 1);
            BigDecimal calculateResult = four.divide(divider, n, BigDecimal.ROUND_UP);
            if (i % 2 == 0){
                pi = pi.add(calculateResult);
            } else {
                pi = pi.subtract(calculateResult);
            }
        }
        pi = pi.setScale(n, BigDecimal.ROUND_UP);
        System.out.println("Pi is: " + pi.toPlainString());
    }

    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        String digitOfPi;
        digitOfPi = user_input.next();

        FindPiToNthDigit findPiToNthDigit = new FindPiToNthDigit();
        findPiToNthDigit.findPiToNthDigit(Integer.parseInt(digitOfPi));
    }
}