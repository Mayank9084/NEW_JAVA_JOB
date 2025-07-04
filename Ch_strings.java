import java.util.Scanner;
public class Ch_strings {
    public static void main(String[] args) {
        System.out.print("Write a string so see STRING METHODS : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // find String Length
        int value = name.length();
        System.out.println("1. String Length : " + value);
        // Convert String into Upper case
        String ustring = name.toUpperCase();
        System.out.println("2. String converts to upper case : " + ustring);
        // Remove starting and ends space
        String trimmed = name.trim();
        System.out.println("3.String Trimmed starting and last space : " + trimmed);
        // where you want to start string with its index value
        String start = name.substring(7);
        System.out.println("4. Start with Index Value 7 : " + start);
        // where you want to start and end string with its index value
        String both = name.substring(7,12);
        System.out.println("5. Start with Index Value 7 and end with 12: " + both);
        // where you want to replace string with its character
        String reep = name.replace('a','u');
        System.out.println("6. In string 'a' replace with 'u' : " + reep);
        // Check String start with given String
        String star = String.valueOf(name.startsWith("Ma"));
        System.out.println("7. Its true or not what string start with 'Ma' : " +star);
        // Check String end with given String
        String ends = String.valueOf(name.endsWith("gh"));
        System.out.println("8. Its true or not what string start with 'gh' : " +ends);
        // Check which character is at index value 2
        String alph_at = String.valueOf(name.charAt(2));
        System.out.println("9. Character at 2 index position : " +alph_at);
        // Find the character index value of "y"
        String inxof = String.valueOf(name.indexOf("y"));
        System.out.println("10. Give Index value of 'y' : " + inxof);
        // check given string is equal to Mayank Singh this is case sensitive
        String eqal = String.valueOf(name.equals("Mayank Singh"));
        System.out.println("11. True if given string is equal to Mayank Singh (with case sensitivity) : " + eqal);
        // check given string is equal to Mayank Singh without case sensitivity
        String casese = String.valueOf(name.equalsIgnoreCase("mayank singh"));
        System.out.println("12. True if given string is equal to mayank singh (without case sensitivity) : " + casese);
    }
}
