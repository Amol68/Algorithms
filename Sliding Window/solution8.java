// Problem : Pick Toys 

Code:

import java.util.*;

class Main {
    
    public static int getCount(String str,int k){
         
         Map<Character, Integer> hmap = new HashMap<>();
         int i=0; int j=0;
         int result=0;
        
        while(j<str.length()){
           
           if(!hmap.containsKey(str.charAt(j))){
               hmap.put(str.charAt(j),1);
           }else{
               int count = hmap.get(str.charAt(j));
               count++;
               hmap.put(str.charAt(j),count);
           }
           
           if(hmap.size()<k) j++;
           
           else if(hmap.size()==k){
               
               int sum=0;
               
               for(int val : hmap.values()){
                   sum += val;
               }
               
               result = Math.max(sum,result);
               j++;   
           }   
           else if(hmap.size()>k){
               
               while(hmap.size()>k){
                   
                   if(hmap.containsKey(str.charAt(i))){
                      int count = hmap.get(str.charAt(i));
                      count--;
                      hmap.put(str.charAt(i),count);
                   }
                   
                    if(hmap.get(str.charAt(i))==0) hmap.remove(str.charAt(i));
                      
                   i++;
               }
               j++;
           }    
        }
        return result;
        
    }
    
    public static void main(String[] args) {

    System.out.println("Result" +getCount("abaccab",2));

    }
}

Time Complexity : O(n);
Space Complexity : O(k);
