
// 875. Koko Eating Bananas
// Attempted
// Medium
// Topics
// premium lock icon
// Companies
// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

 

// Example 1:

// Input: piles = [3,6,7,11], h = 8
// Output: 4
// Example 2:

// Input: piles = [30,11,23,4,20], h = 5
// Output: 30
// Example 3:

// Input: piles = [30,11,23,4,20], h = 6
// Output: 23
// this is the brute froce approch
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // take the max first means to try the element from the 1 to max element of the array
        int max =Integer.MIN_VALUE;
        int n =piles.length;


//first calculate the max
        for(int i=0;i<n;i++){
max =Math.max(piles[i],max);
        }

//calculate the required time
int reqtime =0;
// so range from 1 to max element of the array

        for(int i=1;i<=max;i++){
             
            //pass the array and the k vaules means how much they can eat per hour
            reqtime=func(piles,i);
            //if it is less than equal to h the this is the final answer
            if(reqtime<=h){
                return i;
            }
        }
        return 0;
    }

    public int func(int [] piles , int h){
   int total =0;
   //calcualted the all the total hours
   for(int i=0;i<piles.length;i++){
    
    total += Math.ceil((double)piles[i]/h);
   }
   return total;
    }
}

//optimal using bs
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    
    int low =1;
    int max =0;
    for(int num :piles){
        max=Math.max(num,max);
    }
    int high=max;
    int ans =max;

    while(low<=high){
        int mid =low+(high-low)/2;
        int total =totalfnc(mid,piles);
        if(total<=h){
            ans =mid;
           high=mid-1;
        }
        else{
            low=mid+1;}
    
    }
      return ans;
    }
    public int totalfnc(int mid ,int piles[]){
        int total =0;
        for(int i=0;i<piles.length;i++){
            total += Math.ceil((double)piles[i]/mid);
        }
        return total;
    }
}