package org.generation.italy;

public class Snack5 {
	
//	
//	# Snack 5
//	Dato il seguente array:
//	```java
//	int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
//	```
//
//	- trovare il valore minimo
//	- trovare il valore massimo
//	- calcolare la media
//	- calcolare la sommatoria
	
	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		int minValue=99999999;
		int maxValue=0;
		float avgValue;
		int summation=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(minValue>arr[i])	
				minValue=arr[i];
			if(maxValue<arr[i])
				maxValue=arr[i];
			summation+=arr[i];
			
		}
		avgValue=Float.valueOf(summation)/Float.valueOf(arr.length);
		
		
		System.out.println("minimum value: "+minValue);
		System.out.println("maximum value: "+maxValue);
		System.out.println("avg value: "+avgValue);
		System.out.println("summation value: "+summation);

		
	}

}
