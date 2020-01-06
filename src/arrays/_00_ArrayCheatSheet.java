package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] s = new String[5];
		//2. print the third element in the array
		System.out.println(s[2]);
		//3. set the third element to a different value
		s[2]="hi";
		//4. print the third element again
		System.out.println(s[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		//6. make an array of 50 integers
		int[] i = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int j = 0; j < i.length; j++) {
			i[j]= (int) (50*Math.random());
		}
		//8. without printing the entire array, print only the smallest number in the array
		int lowestNum = i[0];
		for (int j = 0; j < i.length; j++) {
		
			if (lowestNum>i[j]) {
				lowestNum = i[j];
			}
		}
		System.out.println(lowestNum);
		//9 print the entire array to see if step 8 was correct
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		//10. print the largest number in the array.
			int highestNum = i[0];
			for (int k = 0; k < i.length; k++) {
			
				if (highestNum>i[k]) {
					highestNum = i[k];
				}
			}
			System.out.println(highestNum);
	}
}}
