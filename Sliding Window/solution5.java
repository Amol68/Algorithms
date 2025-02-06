// Problem Description: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k
//Brute Force Approach

class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        if(arr==null || arr.length==0) return 0;
        int n = arr.length;
        if(n==1 && arr[0]==k) return 1;
        int length=1;
        int max_length=0;
        
        
         if(arr[0]==k){
             length++;
             max_length=Math.max(max_length,length);
         }
        
        for(int i=1; i<n; i++){
            length++;
            arr[i]=arr[i-1]+arr[i];
             
            if(arr[i]==k){
                max_length=Math.max(max_length,length);
            }
           
        }
        
      return length;
        
    }
}

TC : O(n^2);
SC : O(1);

--------------->--------------->--------------->--------------->--------------->--------------->--------------->--------------->--------------->--------------

// Better Approach

class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        Map<Integer,Integer> hmap = new HashMap<>();
        int result = 0;
        int sum = 0;
        
        for(int i=0; i<arr.length; i++){
            
            sum += arr[i];
            
            if(sum==k)  result = Math.max(result,i+1);
        
            int rem = sum - k;
            if(hmap.containsKey(rem)){
                
                int subArrayLength = i-hmap.get(rem);
                result = Math.max(subArrayLength,result);
                
            }
            
            if(!hmap.containsKey(sum)) hmap.put(sum,i);
        }
          return result;
    }
   
}


TC : O(n);
SC : O(n)




