package logicalprogram;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		System.out.print("Enter the FIRST and SECOND number: ");
        Scanner input = new Scanner(System.in);
        float first = input.nextFloat();
        float second = input.nextFloat();

        System.out.println();
        System.out.println("Before swap");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        //Using a third variable
        swapUsingTemp(first, second);

        //Without using any third variable
        swapWithoutUsingTemp(first, second);

	}
	 private static void swapUsingTemp(float first, float second) {
		 float temporary = first;
	        // Value of second is assigned to first
	        first = second;
	        // Value of temporary (which contains the initial value of first) is assigned to second
	        second = temporary;

	        System.out.println();
	        System.out.println("After swap");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
	 }
	 private static void swapWithoutUsingTemp(float x, float y) {
		 x = x + y;
	        y = x - y;
	        x = x - y;
	        
	        System.out.println();
	        System.out.println("After swap");
	        System.out.println("First number = " + x);
	        System.out.println("Second number = " + y);
	 }

}
