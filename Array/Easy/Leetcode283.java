
//move Zero
class Solution {
    public void moveZeroes(int[] nums) {
        
        int count2 =0;
int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]!=0){
                nums[count2]=nums[i];
                count2++;
            }
        }

        for(int i=count2;i<n;i++){
            nums[i]=0;
        }
    }
}