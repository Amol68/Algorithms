// Description: https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

{/* 
  1. We're creating a queue to store all the negative elements of a current window. At a particular point of time, 
  the queue holds negative numbers which are there in the current running window and not all the negative elements in the array.
  So, that we can retrieve first negative number from the current window.
  
2. When we reached the window size, we need to perform two operations:-

-> First, we have to retrieve the answer that is the first negative number from the current window .
   We're checking if the queue is empty or not. 
   If it is empty, then there is no negative number in the current window. In that case we'll push 0 in the result list.
   If it's not empty, then the first element in the queue is the first negative number of the current window., 
   pushing that into the result list.
   
-> Second, we need to slide the window. For that we need to remove the first element of the current window, 
    and add the next element from  the array to the window. But before removing the first element, 
    we need to check whether it belongs to the list or not. If it belongs to  the list, we need to remove it from the list, 
    as it will not be a part of our next window. So, if the first element is found to be a negative number, 
   then we have to remove it from the list, and this number is happened to be the front element of the list.
   Then, incrementing the values of i and j to   slide the window.


*/}


class Solution {

public static List<Integer> FirstNegativeInteger(int arr[], int k) {
    
      int n = arr.length;
      int i=0; 
      int j=0;
      
      List<Integer> list = new ArrayList<>();
      Queue<Integer> resultQueue = new LinkedList<>();
      
      
      while(j<n){
          
        if(arr[j]<0) resultQueue.add(arr[j]);
          
          if(j-i+1<k){
              j++;
          }
          
          else if(j-i+1==k){
              
             if(resultQueue.isEmpty()) list.add(0);
             
             else{
                 list.add(resultQueue.peek());
               
               if(resultQueue.peek()==arr[i]) 
                 resultQueue.poll();
             }
             i++;
             j++;
          }
          
          
      }
      return list;
    }
}

// TC : O(n)
// SC : O(n)
