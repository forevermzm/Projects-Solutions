/**
 * Have the user enter a number and find all Prime Factors (if there are any) 
 * and display them. 
 */

import java.util.Scanner;

public class PrimeFactorization{

    public void getAllPrimeFactors(int n){
        boolean[] primeArrays = findAllPossibleFactors(n);
        for (int i = 2 ; i < primeArrays.length ; i ++){
            if (primeArrays[i]){
                if (n % i == 0)
                    System.out.println(i + " is a prime factor of " + n);
            }   
        }
    }

    private boolean[] findAllPossibleFactors(int n){
        boolean[] result = new boolean[n + 1];
        for (int i = 0; i < result.length ; i ++){
            result[i] = true;
        }
        for (int i = 2 ; i < result.length ; i ++){
            for (int j = i + 1; j < result.length ; j ++){
                if (j % i == 0)
                    result[j] = false;
            }
        }
        return result;
    }


    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        String nStr;
        nStr = user_input.next();

        PrimeFactorization primeFactorization = new PrimeFactorization();
        primeFactorization.getAllPrimeFactors(Integer.parseInt(nStr));
    }
}