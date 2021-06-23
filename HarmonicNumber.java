package logicalprogram;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		System.out.print("Enter a value of N: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if( n!=0 )
            harmonicValueComputation(n);
        else
            System.out.println("Wrong Input! Value of N cannot be 0!");
		
	}
	
	private static void harmonicValueComputation(int number) {
		float harmonic = 1;
        System.out.print("The Harmonic Series is: ");
        for (int i=1; i<=number; i++) {
        	if ( i!=number ) {
        		System.out.print("1/" +i+ " + ");
        	}
        	else
        	{
        		System.out.println("1/" + i);
        	}
        }
        for (int i = 2; i <= number; i++)
        {
        	harmonic += (float)1 / i;
        }
        System.out.println("The summation Nth Harmonic Value is: " +harmonic);
	}

}
