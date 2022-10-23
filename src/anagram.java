import java.util.Arrays;

public class anagram
{
    static void method1(String s1, String s2)
    {
        //Removing all white spaces from s1 and s2
        String copyOfs1 = s1.replaceAll("\\s", "");
        String copyOfs2 = s2.replaceAll("\\s", "");

        //Initially setting status as true
        boolean status = true;

        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
            status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();

            //Sorting both s1Array and s2Array
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            //Checking whether s1Array and s2Array are equal
            status = Arrays.equals(s1Array, s2Array);
        }

        //Output
        if(status)
        {
            System.out.println(s1+" -AND- "+s2+" are Anagrams");
        }
        else
        {
            System.out.println(s1+" -AND- "+s2+" are -NOT- Anagrams");
        }
    }

    public static void main(String[] args)
    {
        method1("Mother In Law", "Hitler Woman");
        method1("keEp", "peeK");
        method1("Debit Card", "Bad Credit");
        method1("School MASTER", "The ClassROOM");
        method1("DORMITORY", "Dirty Room");
        method1("ASTRONOMERS", "NO MORE STARS");
        method1("Toss", "Shot");

    //Check for Anagram using an Iterative method

            {
                //Removing white spaces from s1 and s2 and changing case to lower

                String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();

                String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

                //Initially setting status as true

                boolean status = true;

                if(copyOfs1.length() != copyOfs2.length())
                {
                    //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

                    status = false;
                }
                else
                {
                    //Converting copyOfs1 to char array

                    char[] s1ToArray = copyOfs1.toCharArray();

                    //Checking whether each character of s1ToArray is present in copyOfs2

                    for (char c : s1ToArray)
                    {
                        int index = copyOfs2.indexOf(c);

                        if(index != -1)
                        {
                            //If character is present in copyOfs2, removing that char from copyOfs2

                            copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
                        }
                        else
                        {
                            //If character is not present in copyOfs2, setting status as false and breaking the loop

                            status = false;

                            break;
                        }
                    }
                }

                //Output

                if(status)
                {
                    System.out.println(s1+" and "+s2+" are anagrams");
                }
                else
                {
                    System.out.println(s1+" and "+s2+" are not anagrams");
                }
            }

        {
            method1("Mother In Law", "Hitler Woman");
            method1("keEp", "peeK");
            method1("SiLeNt CAT", "LisTen AcT");
            method1("Debit Card", "Bad Credit");
            method1("Toss", "Shot");
            method1("joy", "enjoy");
        }

    }
}