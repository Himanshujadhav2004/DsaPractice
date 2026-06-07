// 540. Single Element in a Sorted Array
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

 

// Example 1:

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2
// Example 2:

// Input: nums = [3,3,7,7,10,11,11]
// Output: 10

class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n =nums.length;
        // if the size is of the one element
        if(n==1)return nums[0];
        //check the low
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        //check the high
        if(nums[n-1]!=nums[n-2]) return nums[n-1];

        int low =0;
        int high =n-2;


        while(low<=high){

            int mid =low + (high-low)/2;

             // check if the element has no immediaty duplicated element in left and right
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])return nums[mid];
            
            // if the mid is on the odd eg 3 so check the previous element and if the are equal the eleminate the left half  and same for the if the mid is on the even check the mid+1 if the element is == then also  eleminate the left half
            if(mid %2==1 && nums[mid-1]==nums[mid] || mid%2==0 && nums[mid]==nums[mid+1]){
                low =mid+1;
            }
            //else eleminate the right half
            else{
                high=mid-1;
            }
        } 

        return -1;
    }
}