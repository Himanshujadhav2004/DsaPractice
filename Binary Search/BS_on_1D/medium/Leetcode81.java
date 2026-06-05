class Solution {
    public boolean search(int[] nums, int target) {
        int low= 0;
        int high =nums.length-1;



        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target) return true;
            // this function used to avoid the duplicated elements 
            
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
             low++;
             high--;
            }
            // left part is sorted
            else if(nums[low]<=nums[mid]){
            
            //check the target lies in left part of the array in measn it leas between low to high
            if(target>=nums[low] && target<=nums[mid]){
                high=mid-1;
            }
            //else the target lies on the right part
            else{
                low=mid+1;
            }
            }
            // right part is sorted
            else{
                // target  values lies between the mid to high means in right
                if(target>=nums[mid] &&  target <=nums[high]){
                    low=mid+1;
                }
                // // target  values lies between the low to mid means in left
                else{
                    high=mid-1;
                }

            }
        }
        return false;
    }
}