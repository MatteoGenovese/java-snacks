package org.generation.italy;

public class Snack3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayName = {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0;i< arrayName.length;i++)
		{
			if(i%2!=0)
			{
				sum+=arrayName[i];
			}
			
		}
		
		System.out.println(sum);

	}

}
