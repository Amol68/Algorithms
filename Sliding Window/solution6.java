// Problem : https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

{/*
Approach:
1.	Keep on building the substring from j=0 [increasing the window size] and log occurance of each character in a Map.
2.	If map size (Unique Characters in Map) becomes greater than k, keep on reducing window size (increase i pointer) 
    and decrease the occurance of character from Map till map size becomes <=k. 
3.	If map size becomes equal to k, compute the Candidate answer.
4.	Increase j pointer and perform steps 1-3 until j<array size [while loop condition]
*/}


class Solution {
    public int longestkSubstr(String s, int k) {
        
        int n = s.length();
        int i=0; int j=0;
        Map<Character,Integer> hmap = new HashMap<>();
        int count = 0;
        int result= Integer.MIN_VALUE;
        
        while(j<n){
            
            char c = s.charAt(j);
            
            if(!hmap.containsKey(c)){
                hmap.put(c,1);
            }
            else{
                int curr_char_count = hmap.get(c);
                curr_char_count++;
                hmap.put(c,curr_char_count);
            }
            
            if(hmap.size()<k) j++;
            
            else if(hmap.size()==k) {
             result = Math.max(result,j-i+1);
             j++;
            }
           
            
            else if(hmap.size()>k){
              
              while(hmap.size()>k ){
                  
                char current_char = s.charAt(i);
                  
                  if(hmap.containsKey(current_char)){
                  int char_count = hmap.get(current_char);
                  char_count--;
                  hmap.put(current_char,char_count);
                  }
                  
                if(hmap.get(s.charAt(i))==0)  hmap.remove(s.charAt(i));
                        
                  i++; 
              }
              
               j++;
             
            }}
          return result;
    }
}
