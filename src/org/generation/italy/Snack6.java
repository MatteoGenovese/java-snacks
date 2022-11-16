package org.generation.italy;

public class Snack6 {
	
//	# Snack 6
//	Dati i seguenti array:
//	```java
//	int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
//	int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
//	```
//
//	- calcolare un array sommatoria dove ogni elemento corrisponde alla somma degli elementi dei due array alla stessa posizione
//	```java
//	// Risultato atteso
//	new int[] { 112, 95, ... }
//	```
//	- trovare il valore minimo all'interno di entrambi gli array
//	- trovare il valore massimo all'interno di entrambi gli array
//	- calcolare la media di entrambi gli array (assieme)
//	- calcolare la somma di tutti gli elementi di entrambi gli array
	
	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		int[] sumOfArrayPositionValues = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		
		int minValue=99999999;
		int maxValue=0;
		float avgValue;
		int summation=0;
		
		System.out.print("summation array: {");
		
		for(int i=0; i < arr1.length; i++)
		{

			
			sumOfArrayPositionValues[i]=arr1[i]+arr2[i];
			
			System.out.print(sumOfArrayPositionValues[i]+",");
			
			if(minValue>arr1[i])	
				minValue=arr1[i];
			if(maxValue<arr1[i])
				maxValue=arr1[i];
			if(minValue>arr2[i])	
				minValue=arr2[i];
			if(maxValue<arr2[i])
				maxValue=arr2[i];
			
			summation+=arr1[i]+arr2[i];

		}
		
		System.out.print("}");

		avgValue=Float.valueOf(summation)/Float.valueOf(arr1.length+arr2.length);
		

		System.out.println("");
		
		System.out.println("minimum value: "+minValue);
		System.out.println("maximum value: "+maxValue);
		System.out.println("avg value: "+avgValue);
		System.out.println("summation value: "+summation);

		
	}

}
