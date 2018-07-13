package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] values = { "one", "two", "three", "four", "five" };
		// 2. print the third element in the array
		System.out.println(values[2]);
		// 3. set the third element to a different value
		values[2] = "new3";
		// 4. print the third element again
		System.out.println(values[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < values.length; i++) {
			values[i] = "newString";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		// 7. make an array of 50 integers
		int[] fifty = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < fifty.length; i++) {
			Random rand = new Random();
			int random = rand.nextInt(1000);
			fifty[i] = random;
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallest = fifty[0];
		for (int i = 0; i < fifty.length; i++) {
			if (fifty[i] < smallest) {
				smallest = fifty[i];
			}

		}
		System.out.println(smallest);
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < fifty.length; i++) {
			System.out.println(fifty[i]);
		}
		// 11. print the largest number in the array.
		int largest = fifty[0];
		for (int i = 0; i < fifty.length; i++) {
			if (fifty[i] > smallest) {
				largest = fifty[i];
			}

		}
		// 12. print only the last element in the array
		System.out.println(fifty[fifty.length - 1]);
	}
}
