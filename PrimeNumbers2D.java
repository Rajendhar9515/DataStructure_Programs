package com.bridgelabz.data_structure;

public class PrimeNumbers2D {

	// Storing prime numbers in a 2D-Array
	public static void prime2d(int[][] primeArray, int number) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (isPrime(number)) {
					primeArray[i][j] = number;                   // storing prime numbers in a 2D Array.
				} else {
					primeArray[i][j] = -1;
				}
				number++;
			}
		}
	}

	// Checking the number is prime or not
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;                                             // returning true or false.
	}

	// Printing prime numbers in a required format.
	public static void printPrimeArray(int[][] primeArray) {
		for (int[] firstDimension : primeArray) {
			for (int secondDimension : firstDimension) {
				if (secondDimension != -1 && secondDimension != 1) {
					System.out.print(secondDimension + " ");
				}
			}
			System.out.println("\n");
		}
	}

	// Main method
	public static void main(String[] args) {
		System.out.println("\t PRIME NUMBERS 2D-ARRAY \n");

		int[][] primeArray = new int[10][100];
		int number = 1;
		prime2d(primeArray, number);                               // calling prime2d method to store prime numbers in a 2d-array.
		printPrimeArray(primeArray);                               // printing prime numbers.
	}
}