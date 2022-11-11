/*
Given a non-empty string s and an abbreviation abbr, return whether the string matches with the given abbreviation.
Notice that only the above abbreviations are valid abbreviations of the string "word".
Any other string is not a valid abbreviation of "word".

Note: Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":
Return true.

Example 2:
Given s = "apple", abbr = "a2e":
Return false.
*/
import java.util.*;
class Valid_Word_Abbreviation
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            String abbr = sc.nextLine();
            int count = 0;
            int i = 0, j = 0;
            for (; i < abbr.length() && j < word.length(); i ++)
            {
                if (abbr.charAt(i) >= '0' && abbr.charAt(i) <= '9')
                {
                    if (count == 0 && abbr.charAt(i) == '0')
                        System.out.println("false");
                    count = count * 10 + (abbr.charAt(i) - '0');
                } 
                else
                {
                    if (count != 0)
                    {
                        j = j + count;
                        count = 0;
                    }
                    if (j >= word.length() || abbr.charAt(i) != word.charAt(j))
                        System.out.println("false");
                    j++;
                }
            }
            if(i == abbr.length() && j + count == word.length())
                System.out.println("false");
            else
                System.out.println("true");
            sc.close();
        }
}