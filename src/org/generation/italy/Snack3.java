package org.generation.italy;

public class Snack3 {
	
//	Snack3
//	Crea un array di numeri interi e fai la 
//	somma di tutti gli elementi che sono in posizione dispari

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOfInteger = {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0;i< arrayOfInteger.length;i++)
		{
			if(i%2!=0)
			{
				sum+=arrayOfInteger[i];
			}
			
		}
		
		System.out.println(sum);

	}

}
