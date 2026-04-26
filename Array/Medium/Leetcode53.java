class Solution {
    public int maxSubArray(int[] nums) {
        
     
//brute force

        // int max =Integer.MIN_VALUE;

        // for(int i =0;i<n;i++){
        //      int sum =0;
        //     for(int j=i;j<n;j++){
        //          sum +=nums[j];

        //         if(sum>max){
        //             max=Math.max(max,sum);
        //         }

        //     }
        // }
        // return max;

//optimal
   int  n =nums.length;
int sum=0;
int max =nums[0];
   for(int i=0;i<n;i++){
    sum+=nums[i];
  

    max= Math.max(max,sum);

if(sum<0){
    sum=0;
}  
}
   return max;

    }
}