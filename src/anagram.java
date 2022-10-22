import java.util.Arrays;

//Anagram --> two strings that contain the same characters but in a different order. ie: keep & peek.
public class anagram
{
    //check for Anagram using sort() and equal() methods
    static void itsAnagram(String s1, String s2)
    {
    //first, remove all white spaces from both strings ( s1, s2)
        String copys1 = s1.replaceAll("\\s","");
        String copys2 = s2.replaceAll("\\s","");
        //set the initial status as True
        boolean status = true;
        if(copys1.length() != copys2.length())
        {
            //set the status false if s1 and s2 have different lengths
            status = false;
        }
        else
        {
            //change the case of characters of both copys1,copys2 and convert
            char[] s1Array = copys1.toLowerCase().toCharArray();
            char[] s2Array = copys2.toLowerCase().toCharArray();
            //sort both s1 and s2 arrays
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            //check if both s1 and s2 arrays are equal
            status = Arrays.equals(s1Array, s2Array);
        }
        //what output should appear:
        if(status)
        {
            System.out.println(s1+" and "+s2+" are Anagrams!");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are -NOT- Anagrams!");
        }
    //testing anagram program with string arguments
        static void ifAnagram(String[] args)
        {
            itsAnagram("Mother in Law", "Monster in Law");
            itsAnagram("WHO's the BOSS", "WHO's There?");
            itsAnagram("cAt", "tAc");
        }
    }
}