package dev.codecounty.dsa.arrays;

public class SecondLargest {
    public static Integer findSecondLargest(int[] arr) {
        // Edge case: need at least two elements
        if (arr == null || arr.length < 2) {
            return null;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        // Return null if no second largest exists (e.g., all elements are the same)
        return (second == Integer.MIN_VALUE) ? null : second;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        Integer result = findSecondLargest(numbers);
        
        if (result != null) {
            System.out.println("The second largest element is: " + result);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}