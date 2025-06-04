package xyz;

public class LinearSearchExample {

    public static void main(String[] args) {
        
        int[] numbers = {6, 0, 2, 3, 5, 6, 7, 8};
        int target = 5;
        boolean found = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target " + target + " found at index " + i);
                found = true;
                break;             }
        } 
        if (!found) {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
