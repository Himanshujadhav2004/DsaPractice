// 1876. Substrings of Size Three with Distinct Characters
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// A string is good if there are no repeated characters.

// Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

// Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

// A substring is a contiguous sequence of characters in a string.

 

// Example 1:

// Input: s = "xyzzaz"
// Output: 1
// Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
// The only good substring of length 3 is "xyz".
// Example 2:

// Input: s = "aababcabc"
// Output: 4
// Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
// The good substrings are "abc", "bca", "cab", and "abc".

class Solution {
    public int countGoodSubstrings(String s) {
    HashSet<Character> set =new HashSet<>();
    int n = s.length();
    int left =0;
    int count=0;

    for(int right=0;right<n;right++){
while(set.contains(s.charAt(right))){
    set.remove(s.charAt(left));
    left++;
}
set.add(s.charAt(right));

while(right-left+1>3){
     set.remove(s.charAt(left));
    left++;
}
if(right-left+1==3){
    count++;
}

    }
    return count;
    }
}