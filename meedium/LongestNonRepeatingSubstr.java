package meedium;
import java.util.*;
/*
3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.


 */

public class LongestNonRepeatingSubstr {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("abcabcbb"));
    }


    //brute force my way
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            int count = 0;
            Set<Character> visited = new HashSet<>();
            visited.add(s.charAt(i));
            count++;
            for(int j=i+1;j<s.length(); j++){
                if(!visited.contains(s.charAt(j))){
                    visited.add(s.charAt(j));
                    count++;

                }else{
                    break;
                }
            }
            if(count > ans){
                ans = count;
            }
        }

        return ans;

    }

    //efficient way
    public static int lengthOfLongestSubstring2(String s) {
        int i=0, j=0, max =0;
        Set<Character> set = new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }
}


