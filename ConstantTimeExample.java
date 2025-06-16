package xyz;

public class ConstantTimeExample {

	public static void printFirstElement(int[] arr) {
		if(arr.length > 0) {
			System.out.println("First element is:" + arr[0]);
		}else {
			System.out.println("Array is empty.");
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,89,9};
		printFirstElement(numbers);
	}
}