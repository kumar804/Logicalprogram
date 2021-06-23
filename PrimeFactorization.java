package logicalprogram;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		System.out.print("Enter the number to find the prime factors: ");
        Scanner input = new Scanner(System.in);
        int primeFactor = input.nextInt();
        
        primeFactors(primeFactor);

	}
	private static boolean isPrime(int number) {
		boolean flag = true;
		if (number == 1 || number == 0)
            flag = false;
		 else {
			 for ( int i=2; i <= number/2; i++) {
				 if( number%i ==0)
	                    flag = false;
			 }
		 }
		return flag;
	}
	public static void primeFactors(int primeFactors) {
		int i = 2;
        if (primeFactors == 1 || primeFactors == 0)
            System.out.print("Cannot be determined.");
        else {
        	System.out.print("The prime factors are: ");
            while (primeFactors >= i) {
            	if (primeFactors % i == 0 && isPrime(i) == true) {
            		System.out.print(i + " ");
                    primeFactors = primeFactors / i;
            	}
            	 i = i + 1;
                 if (primeFactors == 2)
                     break;
            }
        }
	}

}
