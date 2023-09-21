package meedium;

public class LongestPalindromicSubstring {
    /*
    Given a string s, return the longest
palindromic

substring
 in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

     */

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }

    public static String longestPalindrome(String s) {
        String ans = null;
        for(int i=0; i<s.length(); i++){
            String str = String.valueOf(s.charAt(i));
            for(int j=i+1; j<s.length(); j++){
                str =  s.substring(i, j);
                if(str.equals(new StringBuilder(str).reverse().toString())){
                    if(str.length() > ans.length()){
                        ans = str.toString();
                    }
                }
            }
        }
        return ans;

//        return null;
    }
}
