/*Given a string S of length N, the task is to count the number of substrings made up of a single distinct character.
Note: For the repetitive occurrences of the same substring, count all repetitions.

Example:
Input: str = “geeksforgeeks”
Output: 15
Explanation: All substrings made up of a single distinct character are
{“g”, “e”, “ee”, “e”, “k”, “s”, “f”, “o”, “r”, “g”, “e”, “ee”, “e”, “k”, “s”}.

Input: str = “abaanndscx”
Output: 12*/
import java.util.*;
class Count_substrings
{
    public static void count_subs(String s)
    {
        int res = 0, ct = 1;
        char prev = '0';
        for(char i : s.toCharArray())
        {
            if(prev == i)
                ct ++;
            else
                ct = 1;
            res += ct;
            prev = i;
        }
        System.out.println(res);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count_subs(s);
        sc.close();
    }
}