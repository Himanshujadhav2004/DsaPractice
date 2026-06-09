class Solution {
    public int findPeakElement(int[] nums) {
        
        int  n=nums.length;
       // this are the edge cases 
        if(n==1){
            return 0;
        }
       //means the low is the greatest element
        if(nums[0]>nums[1]) return 0;
  
         //means the high is the greatest element
        if(nums[n-1]>nums[n-2]) return n-1;

        int low =0;
        int high =n-1;

        while(low<=high){
            int mid =low + (high-low)/2;
           // means the element<mid>element  
           //means the mid is the big form the left element and the right element
            if(nums[mid]>nums[mid+1] && nums[mid-1]<nums[mid]){
                return mid;
            }
           // if the mid is less than the mid+1 means the greatest element is in the right side so updated the low
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            //else the element is in the left part of the array
            else{
                high=mid-1;
            }
        }

   return -1;
    }
}