class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force 
// int n = nums.length;

//         for(int i =0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int sum = nums[i]+nums[j];
//                 if(sum==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};

//optimal
HashMap<Integer,Integer> map = new HashMap<>();
int n = nums.length;
for(int i =0;i<n;i++){
int required = target - nums[i];

if(map.containsKey(required)){
    return new int []{map.get(required),i};
}
map.put(nums[i],i);
}
return new int [] {};
    }
}