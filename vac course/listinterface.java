import java.util.ArrayList;
import java.util.List;

public class listinterface {
    public static void main(String[] args) {
        // Create a List using ArrayList implementation
        List<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print the list
        System.out.println("Original list: " + colors);

        // Add element at specific index
        colors.add(1, "Yellow");
    }}