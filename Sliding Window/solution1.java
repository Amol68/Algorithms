// Problem Description : https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

{/* Approach:

1. Initialization: Start with i = 0 and j = 0. i marks the start of the window, and j marks the end. windowSum keeps the current sum of elements within the window, and maxSum stores the maximum sum found.


2. While Loop (j < arr.length): This loop continues until j reaches the end of the array.
Add arr[j] to windowSum to expand the window.


3. Check Window Size:
If the current window size (j - i + 1) is less than k, increment j to grow the window until it reaches size k.
When j - i + 1 == k:
Compute the maximum sum with maxSum = Math.max(maxSum, windowSum).

Slide the window:
Subtract arr[i] from windowSum to remove the element at the start of the window.
Increment both i and j to move the window forward.



4. Return maxSum: After the loop ends, maxSum will hold the maximum sum of any subarray of size k.


*/}

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
       int sum = 0; 
       int i=0; 
       int j=0;
       int max_sum =Integer.MIN_VALUE;
       
       
       while(j<arr.length){
       
       sum+=arr[j];
       
       if(j-i+1<k){
          
           j++;
          
       }else if(j-i+1==k){
           
           max_sum=Math.max(max_sum,sum);
           sum -= arr[i];
           i++;
           j++;
       }
           
       }
        return max_sum;
       
    }
}

// Time Complexity: O(n);
// Space Complexity: O(n);
