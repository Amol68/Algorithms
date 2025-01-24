
class Solution {
    public int waysToSplitArray(int[] nums) {
        
     long  left_sum=0; 
     long  right_sum=0;
     long sum=0;
     int count=0;
     

     for(int i=0; i<nums.length; i++){
       sum+=nums[i]  ;
     }

      // as per constraint;
     for(int i=0; i<nums.length-1; i++){
        left_sum += nums[i];
        right_sum = sum - left_sum;

        if(left_sum >= right_sum) count++;
     }
      return count;

    }
}

// Time Complexity: O(n);
// Space Complexity : O(n);
