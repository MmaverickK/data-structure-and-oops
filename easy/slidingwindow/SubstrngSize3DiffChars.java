package easy.slidingwindow;

/*
  A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.

 

Example 1:

Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".
Example 2:

Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".

 */

import java.util.Arrays;

public class SubstrngSize3DiffChars {

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("aababcabc"));
    }


    public static int countGoodSubstrings(String s) {
        int ans = 0;
        if (s.length() >= 3) {
            String str = s.substring(0, 3);
            if (uniqueCharacters(str)) {
                ans++;
            }
        }


        if (s.length() > 3) {
            for (int i = 1; i < s.length() - 3 + 1; i++) {
                if (uniqueCharacters(s.substring(i, i + 3))) {
                    ans++;
                }
            }
        }

        return ans;

    }

    private static boolean uniqueCharacters(String str) {
        char[] chArray = str.toCharArray();

        // Using sorting
        // Arrays.sort() uses binarySort in the background
        // for non-primitives which is of O(nlogn) time complexity
        Arrays.sort(chArray);

        for (int i = 0; i < chArray.length - 1; i++) {
            // if the adjacent elements are not
            // equal, move to next element
            if (chArray[i] != chArray[i + 1])
                continue;

                // if at any time, 2 adjacent elements
                // become equal, return false
            else
                return false;
        }
        return true;

    }
}