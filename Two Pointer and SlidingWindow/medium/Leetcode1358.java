// 1358. Number of Substrings Containing All Three Characters
// Attempted
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given a string s consisting only of characters a, b and c.

// Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

// Example 1:

// Input: s = "abcabc"
// Output: 10
// Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
// Example 2:

// Input: s = "aaacb"
// Output: 3
// Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
// Example 3:

// Input: s = "abc"
// Output: 1
 

// Constraints:

// 3 <= s.length <= 5 x 10^4
// s only consists of a, b or c characters.

//bruteForce Code
class Solution {
    public int numberOfSubstrings(String s) {
        
        int n =s.length();
        int count=0;

        for(int i=0;i<n;i++){
            int hash[] =new int[3];
            for(int j=i;j<n;j++){
              hash[s.charAt(j)-'a']=1;

              if(hash[0]+hash[1]+hash[2]==3){
                count+=1;
              }
            }

        }
        return count;
    }
}

//optimal one
class Solution {
    public int numberOfSubstrings(String s) {
        int lastseen [] = {-1,-1,-1};
        int n =s.length();
        int count=0;
        for(int  i=0;i<n;i++){
            lastseen[s.charAt(i)-'a']=i;

            if(lastseen[0]!=-1  && lastseen[1]!=-1 && lastseen[2]!=-1  ){
                int min = Math.min(lastseen[0], Math.min(lastseen[1], lastseen[2]));
                count+=min+1;
            }
        }
        return count;
    }
}