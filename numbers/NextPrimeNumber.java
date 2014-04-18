/**
 * Have the program find prime numbers until the user chooses to stop asking for the next one.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class NextPrimeNumber {

    private ArrayList<Integer> primeList = new ArrayList<Integer>();

    private int getNextPrime() {
        if (primeList.size() == 0) {
            primeList.add(Integer.valueOf(2));
            return 2;
        }
        int result = primeList.get(primeList.size() - 1) + 1;
        while (true){
            int sqrt = (int) Math.sqrt(result);
            boolean found = false;
            for (int i = 0 ; i < primeList.size() ; i ++){
                int nowPrime = primeList.get(i);
                if (nowPrime <= sqrt){
                    if (result % nowPrime == 0)
                        break;
                } else {
                    found = true;
                    break;
                }
            }
            if (found) break;
            else result ++;
        }
        primeList.add(Integer.valueOf(result));
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Enter anything except -1 to get the next prime, enter -1 to stop generating.");
        NextPrimeNumber instance = new NextPrimeNumber();
        Scanner user_input = new Scanner(System.in);
        while (Integer.parseInt(user_input.next()) != -1) {
            int nextPrime = instance.getNextPrime();
            System.out.println(nextPrime);
        }

    }
}