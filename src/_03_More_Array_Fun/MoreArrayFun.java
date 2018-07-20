package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
		
		
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void ArrayPrinter(String strings[]){
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	void ArrayPrinterRev(String strings[]){
		for (int i = strings.length; i > 0; i--) {
			System.out.println(strings[i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void ArrayPrinterEveryother(String strings[]){
		for (int i = strings.length; i > 0; i--) {
			if(i%2 == 0) {
				System.out.println(strings[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void ArrayPrinterRand(String strings[]){
		for (int i = 0; i < strings.length; i++) {
			Random rand = new Random();
			for (int j = 0; j < strings.length; j++) {
				rand.nextInt(strings.length);
			}
		}
	}
	
}
