package org.generation.italy;

public class Snack7 {
	
//	Dato il seguente array:
//		```java
//	String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", 
//	"consectetur", "adipisicing", "elit" };
//		```
//		- creare e stampare una stringa che sia la concatenazione di 
//		tutti gli elementi dell'array in ordine
//		- creare e stampare una stringa che sia la concatenazione di 
//		tutti gli elementi dell'array in ordine *inverso*
//		- trovare e stampare la parola piu' lunga e la sua lunghezza
//		- trovare e stampare la parola piu' corta e la sua lunghezza

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		String wordsConcatenation="";
		String reverseConcatention="";
		String shorterWord=" consectetur consectetur consecteturconsectetur consectetur consectetur ";
		
		
		for (int i = 0; i < words.length; i++) {
			
			wordsConcatenation+= " "+words[i];
			reverseConcatention+= " "+words[words.length-i-1];
			
			if(i==0)
			{
				wordsConcatenation= words[i];
				reverseConcatention= words[words.length-i-1];
			}
			
			if(shorterWord.length() > words[i].length())
			{
				shorterWord=words[i];
			}
			
		}
		System.out.println("wordsConcatenation: "+wordsConcatenation);
		System.out.println("reverseConcatention: "+reverseConcatention);
		System.out.println("shorterWord: "+shorterWord);


	}

}
