import java.util.Scanner;

public class dayOne // Reverse a string without using functions
{
    // First way: reversing each character from string.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Read the string's input
        System.out.println("Original String : ");

        String inputStr = input.nextLine();

        String words[] = inputStr.split("\\s"); //spliting the string by using a space as a delimiter.
        String reversedStr = " ";

        //create a loop to go through all the words, and reverse each letter of the string.
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }
            reversedStr = reversedStr + reversedWord + " ";
        }
        //Show string in reverse
        System.out.println("Reversed String : " + reversedStr);

        // Second way: reversing the words in a string
        System.out.print("Original string : ");

        String originalStr = input.nextLine();
        input.close();

        String wordz[] = originalStr.split("\\s");
        String reversedString = "";

        //Reverse each word's position
        for (int i = 0; i < wordz.length; i++) {
            if (i == wordz.length - 1)
                reversedString = wordz[i] + reversedString;
            else
                reversedString = " " + wordz[i] + reversedString;
        }

        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }
}
