// Description: https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1

Approach:
{/* 

  1) Create an unordered map for the given pattern. The map stores all the distinct characters of the pattern as keys,
   and their frequencies as values. Create a variable count, which has the count of all the distinct characters in the pattern, 
   which is the size of the map. Create another variable for storing the actual answer.

 2) Inside the while loop, compare the jth character with the keys of the map. If this character is found in the map, decrement
  its corresponding value. If the value of any of the keys becomes 0, decrement the value of count. It means that you’ve found 
  one character in its required quantity in your current window. Like this if for every character in the map, the value becomes 0, 
  then the value of count becomes 0, and it signifies that the current window is an anagram of the pattern. We’re using this count
  variable to signify whether the window is an anagram or not(in O(1) time), otherwise we have to traverse the whole map for checking
  if every corresponding value has become 0 or not, and it would have taken O(K) time.

3) When you’ve reached the window size, you need to do 2 things:-
 a)	Retrieving the answer- if the count becomes 0, anagram is found, increment the value of ans variable.
 b)	Sliding the window- before sliding the window, we need to remove all the calculations regarding the first element in the
 current window. If it exists in the map, then we need to increment the corresponding value in the map. Why we’re incrementing 
 its value because, this character is not going to be there in our next window, so if it has contributed in making an anagram 
 for our previous window, we need to delete its appearance or significance in the map, which tells that there’s a gap which needs 
 to be filled by the next incoming character to complete this incomplete anagram. And only if the corresponding value in the map
 has become 1, we’ll increment the value of count, and not for any other case.

*/}

import java.util.*;

class Main {

    public static int search(String pat, String txt) {
    
     Map<Character,Integer> map = new HashMap<>();
     
     for(int i=0; i<pat.length(); i++){
         
         char c = pat.charAt(i);
         
         if(map.containsKey(c)){
             
             int count = map.get(c);
             map.put(c,count++);
             
         }else{
             map.put(c,1);
         }
     }
       
       int i=0; int j=0;
       int result=0;
       int n = txt.length();
       int k = pat.length();
       int count = map.size();
       
       while(j<n){
           
           char c = txt.charAt(j);
           
           if(map.containsKey(c)){
               
               int char_count = map.get(c);
               map.put(c,char_count--);
               
               if(char_count==0) count--;
           }
           
           if(j-i+1<k) j++;
           
           else if(j-i+1==k){
               
               if(count==0) result++;
               
               if(map.containsKey(txt.charAt(i))){
                   
                   int char_count = map.get(txt.charAt(i));
                   map.put(txt.charAt(i),char_count++);
                   
                   if(char_count==1){
                       count++;
                   }  
               }
               i++;
               j++;
           }
       }
        return result;
    }
   
    public static void main(String[] args) {
      int result = search("for","forxxorfxdofr");
      System.out.println(result);
    }
}

