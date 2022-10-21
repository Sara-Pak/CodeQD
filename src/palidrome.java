import java.util.Scanner;
<<<<<<< HEAD
import java.util.Stack;

public class palidrome
{
    //check the palidrome by using a reverse comparison
    public static void main(String[] args) {
=======

public class palidrome
{
    public static void main(String[] args) {

>>>>>>> CodeQD/master
        System.out.print("Enter any string : ");
        Scanner in = new Scanner(System.in);

        //Original string
        String origString = in.nextLine();
        int length = origString.length();

        boolean isPalindrome = true;

        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex)) {
                System.out.println("String is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }
<<<<<<< HEAD
        if(isPalindrome) {
            System.out.println("String is a palindrome.");
        }

    // Check palidrome by using a StringBuilder.reverse() method. (shortest way to reverse strings)
        System.out.print("Enter any string : ");
        Scanner method2 = new Scanner(System.in);

        //Original string
        String origStr = method2.nextLine();

        //Reverse string
        String reverseString = new StringBuilder(origStr).reverse().toString();

        // Check palindrome string
        if (origStr.equals(reverseString)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    // Check palidrome by using java.util.stack
        System.out.print("Enter any string : ");
        Scanner method3 = new Scanner(System.in);
        String oriString = method3.nextLine();

        Stack<Character> stack = new Stack<>();

        //Push all chars in stack
        for (int i = 0; i < oriString.length(); i++) {
            stack.push(oriString.charAt(i));
        }

        String reverseStr = "";

        //Pop all chars from stack one by one and build reverse string
        while (!stack.isEmpty()) {
            reverseStr = reverseStr + stack.pop();
        }

        //Check palindrome string
        if (oriString.equals(reverseStr)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
=======

        if(isPalindrome) {
            System.out.println("String is a palindrome.");
>>>>>>> CodeQD/master
        }
    }
}