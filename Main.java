public class Main {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found, return index
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        int target = 4;
        int result = linearSearch(numbers, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }
}