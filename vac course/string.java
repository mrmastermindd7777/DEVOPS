public class string {
    public static void main(String[] args) {
        // String declaration and initialization
        String str1 = "Hello";
        String str2 = "World";
        
        // String concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated string: " + combined);
        
        // String length
        System.out.println("Length of string: " + combined.length());
        
        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Lowercase: " + combined.toLowerCase());
        
        // Substring
        System.out.println("Substring (0,5): " + combined.substring(0,5));
        
        // Character at specific position
    }}