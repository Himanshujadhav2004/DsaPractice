class Solution {
    public int search(int[] nums, int target) {
        int n =nums.length;
        int low=0;
        int high =nums.length-1;

        while(low<=high){

  int mid =low+(high-low)/2;
  if(nums[mid]==target) return mid;
  //check if the left part is sorted 
            if(nums[low]<=nums[mid]){
//check if the target lies between the low to mid
if(target>=nums[low] && target<=nums[mid]) {
    high=mid-1;}
// if it not lies between them the mode the low =mid+1;
else  { low=mid+1;}
            }
//right part is sorted
            else{
// check the target lies between the mid to high;
if(target>=nums[mid] && target<=nums[high]){
    low=mid+1;
}
// if not the search in the left side 
else high=mid-1;
            }
        }
        return -1;
    }
}