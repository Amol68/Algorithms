// Problem: https://www.interviewbit.com/problems/sliding-window-maximum/
// Brute Force
import java.util.*;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] A, int B) {
        
      
       int curr_max = Integer.MIN_VALUE;
       int i=0; int j=0;
       int n = A.length;
        int[] result = new int[n];
       
       while(j<n){
           
           if(j-i+1<B) j++;
           
           else if(j==B){
               
               for(int x=i; x<=j; x++){
                   curr_max=Math.max(curr_max,A[x]);
               }
               
               result[i]=curr_max;
               curr_max=Integer.MIN_VALUE;
               i++; 
               j++;
           }
           
       }
       
       return result;
    }
}

-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->

{/* 

1.	We have to create such a data structure which is open from both the sides, so that we can push and pop elements from any corner, 
   and list is one such data structure. The first element of the list will contain maximum value of current window, the subsequent
   elements in the list are the candidate or possible maximum values for subsequent or future windows.

2.	For jth value calculation- if the list is empty at first, then whatever comes first in the array will be pushed as maximum 
   value in the list. In the list we need to store only those values which can become candidate maximum values for next sliding windows. 
    So comparing jth value with the back of the list, if it comes out to be greater than the back of the list, then the back of the list
    becomes unused, as they can never become maximum value for future windows, so all these values which are less than the jth value 
    needs to be deleted. If the jth value is less than the back of the list, it might not serve as the maximum value for the current 
    window, but it can serve as the maximum value for future windows, so we need to preserve this, pushing them into the list for '
    future use.

3.	For retrieving the answer- the max value for the current window is always available at the front of the list, 
   because all the values which are less than this value are deleted from the list, so the maximum value always occupies 
    the first place in the list.

4.	For sliding the window- before moving i and j iterators, we need to check whether the ith value belongs to the list or not. 
    And it happens to belong to the list only if it has served as the maximum value for current window. If it hasn’t served as the max 
    value, then there’s no chance that it can be found in the list. So deleting the front element of the list if it equals to ith value. Then i++ and j++.

*/}

  
import java.util.*;

public class Solution {
   
    public int[] slidingMaximum(final int[] A, int B) {
        
      
       Deque<Integer> queue = new LinkedList<>();
       int i=0; int j=0;
       int n = A.length;
        int[] result = new int[n];
       
       while(j<n){
           
           if(queue.size()==0) queue.add(A[j]);
           else
           if(queue.size()>0 && queue.peek()<A[j]){
               queue.removeLast();
           }
           queue.add(A[j]);
           
           if(j-i+1<B) j++;
           
           else if(j==B){
               
              result[i]=queue.peek();
              
              if(A[i]==queue.peek()){
                  queue.removeFirst();
              }
              
              
               i++; 
               j++;
           }
           
       }
       
       return result;
    }
}

