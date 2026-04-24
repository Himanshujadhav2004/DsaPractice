class Solution {
    public int[] rearrangeArray(int[] nums) {
        //brute;
// int n = nums.length;
//         int postive [] = new int[n/2];
//         int negative[]= new int  [n/2];

//         int pos =0;
//         int neg=0;

//         for(int i =0;i<n;i++){
//             if(nums[i]<0){
//                 negative[neg]=nums[i];
//                 neg++;
//             }
//             else{
//                 postive[pos]=nums[i];
//                 pos++;
//             }
//         }
// int b=0;
//         for(int i =0;i<n/2;i++){
// nums[b++]=postive[i];
// nums[b++]=negative[i];

//         }


//         return nums;

//optimal


int n = nums.length;
int pos=0;
int neg=1;
int result[] = new int [n];

for(int num:nums){
    if(num>0){
result[pos]=num;
pos+=2;
    }
    else{
        result[neg]=num;
neg+=2;
    }
}
return result;
    }
}