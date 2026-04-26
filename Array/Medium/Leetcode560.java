//Subarray Sum Equals K
class Solution {
    public int subarraySum(int[] nums, int k) {

        //brute force;
//  int n = nums.length;
//    int count =0;

//         for(int i =0;i<n;i++){
//             int sum =0;
         
//             for(int j=i;j<n;j++){
//                 sum+=nums[j];
               

//                 if(sum==k){
//                      count++;
                 
//                 }
                
//             }
//         }
//         return count;
  
//optimal code
   HashMap<Integer,Integer> map = new HashMap<>();

   map.put(0,1);
   int total =0;
int sum =0;
   for(int num :nums ){
sum+=num;

if(map.containsKey(sum-k)){
    total+=map.get(sum-k);
}

map.put(sum,map.getOrDefault(sum,0)+1);
   }
   return total;
    }
}