// 76. Minimum Window Substring
// Solved
// Hard
// Topics
// premium lock icon
// Companies
// Hint
// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

// The testcases will be generated such that the answer is unique.

 

// Example 1:

// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
// Example 2:

// Input: s = "a", t = "a"
// Output: "a"
// Explanation: The entire string s is the minimum window.
// Example 3:

// Input: s = "a", t = "aa"
// Output: ""
// Explanation: Both 'a's from t must be included in the window.
// Since the largest window of s only has one 'a', return empty string.

class Solution {

    public String minWindow(String s, String t) {

        int[] maps = new int[256];
        int[] mapt = new int[256];

        // frequency of t
        for (char ch : t.toCharArray()) {
            mapt[ch]++;
        }

        int left = 0;
        int min = Integer.MAX_VALUE;
        int minStart = 0;

        for (int right = 0; right < s.length(); right++) {

            maps[s.charAt(right)]++;

            while (contains(maps, mapt)) {

                if (right - left + 1 < min) {
                    min = right - left + 1;
                    minStart = left;
                }

                maps[s.charAt(left)]--;
                left++;
            }
        }

        return min == Integer.MAX_VALUE
                ? ""
                : s.substring(minStart, minStart + min);
    }

    private boolean contains(int[] maps, int[] mapt) {

        for (int i = 0; i < 256; i++) {

            if (mapt[i] > maps[i]) {
                return false;
            }
        }

        return true;
    }
}