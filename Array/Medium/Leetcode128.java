//Longest Consecutive Sequence

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer> set = new HashSet<>();
int max=0;

    for(int num:nums){
        set.add(num);
    }

    for(int num:set){

        if(!set.contains(num-1)){
            int  count =1;
int number=num;
while(set.contains(number+1)){
count++;
number++;
}
max=Math.max(max,count);
        }
    }
    return max;
    }
}