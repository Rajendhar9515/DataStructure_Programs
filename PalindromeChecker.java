package com.bridgelabz.data_structure;

import java.util.Scanner;

public class PalindromeChecker {

	// creating static instance of Deque class
	static Deque<Character> deque = new Deque<Character>();

	public static void main(String[] args) {
		System.out.print("\t WELCOME TO PALINDROME-CHECKER \n");

		// Taking user Input 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string :- ");
		String input_string = input.nextLine();

		char[] charArray = input_string.toCharArray(); // converting string into char array.

		// adding charArray in a deque
		for (int i = 0; i < charArray.length; i++) {
			deque.addRear(charArray[i]);
		}
		System.out.print("Palindrome-Checker :- " + checkPalindrome());
	}

	// checking that the character array is palindrome or not
	public static boolean checkPalindrome() {
		boolean isPalindrome = false;
		while (deque.isEmpty() == false) {
			if (deque.size() != 1) {
				if (deque.removeFront().equals(deque.removeRear())) {
					isPalindrome = true;
				} else {
					isPalindrome = false;
					break;
				}
			} else {
				deque.removeRear();
				isPalindrome = true;
			}
		}
		return isPalindrome;
	}
}
