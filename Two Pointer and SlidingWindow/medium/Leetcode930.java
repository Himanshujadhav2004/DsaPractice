//930. Binary Subarrays With Sum

// Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

// A subarray is a contiguous part of the array.

 

// Example 1:

// Input: nums = [1,0,1,0,1], goal = 2
// Output: 4
// Explanation: The 4 subarrays are bolded and underlined below:
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// Example 2:

// Input: nums = [0,0,0,0,0], goal = 0
// Output: 15

//brute froce approch
//but not using two pointer and sildingwindow
 
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
    
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j =i;j<n;j++){
            sum+=nums[j];
            if(sum==goal){
                count++;
            }
            }
        }
        return count;
    }
}


//optimal using the two pointer and sliding window 

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return almost(nums,goal)-almost(nums,goal-1);
        
    }

    public int almost(int nums[],int goal){
        if(goal<0) return 0;
        int l =0;
        int sum=0;
        int count=0;

        for(int r=0;r<nums.length;r++){

            sum+=nums[r];

            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count +=(r-l)+1;
        }
        return count;
    }
}