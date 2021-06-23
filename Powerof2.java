package logicalprogram;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		 System.out.print("Enter the power value N: ");
	        Scanner input = new Scanner(System.in);
	        int powerValue = input.nextInt();

	        powerIterative(powerValue);

	}
	
	 //Ensure Only works if 0 <= N < 31 since 2^31
	public static void powerIterative(int exp) {
		 int base=2,result=1;
	        if(exp >= 0)
	            System.out.println("2 ^ 0 = 1");
	        if(exp > 0 && exp < 31) {
	        	for (int i = 1; i <= exp; i++) {
	        		  result = result * 2;
	                  System.out.println("2 ^ " +i+ " = " +result);
	        	}
	        }
	        else
	            System.out.println("Wrong input! Power value of N cannot exceed 31!");
	}

}
