package week4CodingProject;

import java.util.Arrays;

public class Week4coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(Arrays.toString(ages));
	
//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int newAges = ages[ages.length - 1] - ages[0];
		System.out.println("Result: " + newAges);
		
//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		int[] ages2 = new int[9];
		System.out.println(Arrays.toString(ages2));

//i. Make sure that there are 9 elements of type int in this new array.  
		
	
//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		int newAges2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("Result: " + newAges2);
//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).  
		/////////result = ages2[ages.length - 1] - ages2[0];   ?????????????********* SEE LINE 17 AND 18....

//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		double average = (double) sum / ages.length;
		System.out.println("Average: " + average);

//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int letters = 0;
		for (String name : names) {
			letters += name.length();
		}
		double averageLetters = (double) letters / names.length; 
		System.out.println("Average number of letters in name: " + averageLetters);

//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		StringBuilder concatenatedNames = new StringBuilder();
		for (String name : names) {
			concatenatedNames.append(name).append(" ");
		}
		System.out.println("Concatenated Names: " + concatenatedNames.toString());

//3. How do you access the last element of any array?
		//  myArray[myArray.length - 1];
		
//4. How do you access the first element of any array?
		//  firstElement = array[0];

//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			
		}
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		for (int length : nameLengths) {
			sum += length; 
		}
		System.out.println("Sum of name lengths: " + sum);

//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		//public static String repeatWord(String word, int n) {
			//StringBuilder result = new StringBuilder();
			//for (int i = 0; i < n; i++) {
				//result.append(word);
			//}
			//return result.toString();
		//}

//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		public static String bothNames(string firstName, String lastName) {
			return firstName + " " + lastName;
		}

//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		public static boolean greaterThan100(int[] array) {
			int sum = 0;
			for (int num : array) {
				sum += num; 
			}
			return sum > 100;
			
		}

//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		public static double averageElements(double[] array) {
			double sum = 0;
			for (double num : array) {
				sum += num; 
			}
			return sum / array.length; 
		}

//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		public static boolean averageElements(double[] array1, double[] array2) {
			return  ???????
		}

//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		//check to see if a number divisible by 33; I chose this for lack of creativity, I suppose. And Larry Bird was my favorite player growing up and he wore 33 
		public static boolean canDivideBy33(int number) {
			int number = 99;
		
		int (canDivideBy33(number)) {
			System.out.println(number + " is divisible by 33.");
		} else {
			System.out.println(number + " is not divisible by 33.");
		}



	}

}
