package org.generation.italy;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Snack2 {
	
//	Snack2
//	Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di 
//	nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa 
//	lista di invitati con nome e cognome.

	public static void main(String[] args) {

		String[] names = {
				"Matteo", 
				"Luca", 
				"Gabriele", 
				"Giovanni"
				};

		String[] surnames = {
				"Genovese", 
				"Spennato", 
				"Magnani", 
				"Muciaccia"
				};

		Random rnd = new Random();
		
		String[] fullNames ;
		

	    

	    for (int i = 0; i < surnames.length; i++) {
	    	
	    	String name = names[i];
	    	
	    	int surnameIndex = rnd.nextInt(surnames.length);
	    	String surname = surnames[surnameIndex];
	    	String fullName = name+" "+surname;
	    	System.out.println(fullName);
	    }
	}

}
