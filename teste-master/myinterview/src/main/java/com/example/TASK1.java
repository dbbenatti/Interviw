package com.example;

/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {
    public void palindrome(String palavra) {
        String palin = "";
		System.out.print("A Palavra: " + palavra);
		palin = new StringBuffer(palavra).reverse().toString();
        
	    if (palavra.equals(palin))
        {
	        System.out.println(" A palavra é palindrome!");
	    }
        else
        {
	        System.out.println(" A palavra não é palindrome!");
	    }
    }
}
