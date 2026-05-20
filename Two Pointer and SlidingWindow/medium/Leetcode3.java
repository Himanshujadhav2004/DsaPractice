//3. Longest Substring Without Repeating Characters

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        HashSet<Character> set =new HashSet<>();

        int left=0;
        int max =0;
       

        for(int right=0;right<n;right++){
        
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));
max =Math.max(max,right-left+1);
        }
        return max;
    }
}