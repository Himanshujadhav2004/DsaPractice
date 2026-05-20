
// 1004. Max Consecutive Ones III
// Attempted
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// Example 2:

// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

//brute
class Solution {
    public int longestOnes(int[] nums, int k) {
    int n =nums.length;
   
    int max=0;

    for(int i=0;i<n;i++){
         int zero=0;
        for(int j=i;j<n;j++){
            if(nums[j]==0){
            zero++;
            }
            if(zero<=k){
max =Math.max(max,j-i+1);
            }
        }
    }
    return max;
    }
//optimal
class Solution {


    public int longestOnes(int[] nums, int k) {
       int n=nums.length;
       int left=0;
       int max=0;
       int zero=0;

       for(int right=0;right<n;right++){
if(nums[right]==0){
    zero++;
}

while(zero>k){
   if(nums[left]==0){
    zero--;
   }

left++;
}
max=Math.max(max,right-left+1);

       }
       return max;
    }
}


