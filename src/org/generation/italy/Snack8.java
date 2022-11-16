package org.generation.italy;

import java.util.Random;

public class Snack8 {
	
//	# Snack 8 - BONUS
//	Creare un array di 10 elementi interi random compresi tra `-50` e `+50` (utilizzare 
//	l'oggetto random con seed 128 `new Random(128)`)
//	```java
//	// Risultato atteso
//	new int[] { 39, -32, -48, 25, 17, -27, 8, -13, -30, 40 }
//	```
//	- trovare il valore *assoluto* piu' grande e stampare il valore corrispondente
//	```java
//	// Risultato atteso
//	(int) -48
//	```
//	- trovare il valore *assoluto* piu' piccolo e stampare il valore corrispondente
//	```java
//	// Risultato atteso
//	(int) 8
//	```
//	- calcolare la sommatoria dei valori multipli di 5
//	```java
//	// Risultato atteso
//	(int) 35
//	```

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random(128);
		int[] array= new int[10];
		
		int maxAbsoluteNumber=0;
		int minAbsoluteNumber=100;
		int summationOfNumbersMultiplesOf5 = 0;
		
		System.out.print("Array: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i]=rnd.nextInt(100)-50;
			System.out.print(array[i]+",");
			
			if(Math.abs(array[i])>maxAbsoluteNumber)
				maxAbsoluteNumber=Math.abs(array[i]);
			if(Math.abs(array[i])<minAbsoluteNumber)
				minAbsoluteNumber=Math.abs(array[i]);
			if(array[i]%5==0)
				summationOfNumbersMultiplesOf5+=array[i];
			
		}
		
		System.out.println("");

		
		System.out.println("maxAbsoluteNumber: "+maxAbsoluteNumber);
		System.out.println("minAbsoluteNumber: "+minAbsoluteNumber);
		System.out.println("summationOfNumbersMultiplesOf5: "+summationOfNumbersMultiplesOf5);

	}

}
