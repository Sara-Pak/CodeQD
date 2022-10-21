import java.util.Scanner; // method 1, 2
import java.util.Stack;  // method 3
import java.util.Queue; // method 4
import java.util.LinkedList; // method 4

public class palidrome
{
    //check the palidrome by using a reverse comparison
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| Method 1 : Palindrome using java.util.Scanner, a reverse comparison |");
        System.out.println("-----------------------------------------------------------------------");

        System.out.print("Enter any string : ");
        Scanner in = new Scanner(System.in);

        //Original string
        String origString = in.nextLine();
        int length = origString.length();

        boolean isPalindrome = true;

        for (int beginIndex = 0; beginIndex < length; beginIndex++) {
            if (origString.charAt(beginIndex) != origString.charAt(length - 1 - beginIndex)) {
                System.out.println("String is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("String is a palindrome.");
        }

        // Check palidrome by using a StringBuilder.reverse() method. (shortest way to reverse strings)
        System.out.println("------------------------------------------------------------------");
        System.out.println("| Method 2 : Palindrome using the StringBuilder.reverse() method |");
        System.out.println("------------------------------------------------------------------");

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
        System.out.println("-----------------------------------------------");
        System.out.println("| Method 3 : Palindrome using java.util.Stack |");
        System.out.println("-----------------------------------------------");

        System.out.print("Enter any string : ");
        Scanner method3 = new Scanner(System.in);
        String oriString = method3.nextLine();

        Stack<Character> stack = new Stack<>();

        //Push all chars in stack
        for (int i = 0; i < oriString.length(); i++)
        {
            stack.push(oriString.charAt(i));
        }

        String reverseStr = "";

        //Pop all chars from stack one by one and build reverse string
        while (!stack.isEmpty())
        {
            reverseStr = reverseStr + stack.pop();
        }

        //Check palindrome string
        if (oriString.equals(reverseStr))
        {
            System.out.println("String is a palindrome.");
        }
        else
        {
            System.out.println("String is not a palindrome.");
        }

    // Check palindrome string by using java.util.Queue --> using queue's add() and remove() methods allows to build a reverse string for a given string then compare the strings.
        System.out.println("------------------------------------------------------------------------");
        System.out.println("| Method 4 : Palindrome using java.util.Queue and java.util.LinkedList |");
        System.out.println("------------------------------------------------------------------------");

        System.out.print("Enter any string : ");
        Scanner method4 = new Scanner(System.in);
        String oriStr = method4.nextLine();

        Queue<Character> queue = new LinkedList<>();

        for (int i = oriStr.length()-1; i >=0; i--) {
            queue.add(oriStr.charAt(i));
        }

        String reversStr = "";

        //Pop all chars from stack one by one and build reverse string
        while (!queue.isEmpty()) {
            reversStr = reversStr + queue.remove();
        }

        //Check palindrome string
        if (oriStr.equals(reversStr)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }

        //Check palindrome string using loops --> iterates each character array in reverse and creates string by appending characters to reverse string.
        System.out.println("--------------------------------------------");
        System.out.println("| Method 5 : Palindrome using string loops |");
        System.out.println("--------------------------------------------");

        System.out.print("Enter any string : ");
        Scanner method5 = new Scanner(System.in);
        String orig_String = method5.nextLine();
        String reverse_String = "";

        char[] characters = orig_String.toCharArray();

        for( int i = characters.length - 1 ; i >= 0 ; i-- ) {
            reverse_String = reverse_String + characters[i];
        }

        //Check palindrome string
        if (orig_String.equals(reverse_String)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }



    }
    }