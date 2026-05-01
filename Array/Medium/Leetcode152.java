//152. Maximum Product Subarray
// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
class Solution {
    public int maxProduct(int[] nums) {
        int  n=nums.length;
        int prefix =1;
        int suffix =1;
        int max= Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }

            prefix*=nums[i];
            suffix*=nums[n-1-i];
max= Math.max(max,Math.max(prefix,suffix));

        }
        return max;
    }
}