package org.generation.italy;

import java.util.Scanner;

public class Snack1 {
	
//	Snack1
//	Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insert a number: ");
		int userNumber = scanner.nextInt();
		
		if(userNumber % 2 == 0)
		{
			System.out.println("even number ->"+userNumber);
		}
		else
		{
			int newNumber = userNumber+1;
			System.out.println("odd number, select the next number -> " + newNumber);
		}
		
	}

}
