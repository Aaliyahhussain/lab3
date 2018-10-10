package lab3;

import java.util.Scanner;

public class Lab3ConditionalStatementsApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		

		char userContinue = 'Y';
while( userContinue == 'Y') {	

	System.out.println("Enter a number between 1 and 100: ");
	int number = scnr.nextInt();
	
	if ((number % 2 == 1) && (number < 60)) {
		System.out.println("Odd");
	}
	else if (( number % 2 == 0 ) && (number > 2) && (number <25)) {
		System.out.println("Even and less than 25");
	}
	else if (( number % 2 == 0 ) && (number > 60) && (number < 100)) {
		System.out.println("Even");
	}
	else if (( number % 2 == 1) && (number > 60) && (number < 100)) {
		System.out.println("Odd and over 60");
	}
	else {
		System.out.println("invalid entry");
	
	

System.out.println("Continue Y/N: ");
 userContinue = scnr.next().charAt(0);
 
	

	
}
	
	}
	
}
	
}