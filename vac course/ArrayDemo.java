public class ArrayDemo {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Print array elements using for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Calculate sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of elements: " + sum);
        
        // Find maximum element
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element: " + max);
        
        // Modify array element
        numbers[2] = 35;
        System.out.println("\nModified array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}