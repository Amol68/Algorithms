class Solution {
    public int totalFruit(int[] fruits) {
        int result = Integer.MIN_VALUE;
        int count = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int i=0; int j=0;
        int n = fruits.length;

        if(fruits.length<2) return 1;

        if(fruits.length==2 && fruits[0]==fruits[1]) return 2;

        while(j<n){
        
          count++;

           if(!hmap.containsKey(fruits[j])){
               hmap.put(fruits[j],1);
           }else{
               int curr_count = hmap.get(fruits[j]);
               curr_count++;
               hmap.put(fruits[j],curr_count);   
        }

         if(hmap.size()<2) { 
             result=Math.max(result,count);
            j++;}

        else if(hmap.size()==2){
            result=Math.max(result,count);
            j++;
         }

       else if(hmap.size()>2){

          while(hmap.size()>2){
          
       if(hmap.containsKey(fruits[i])){
        int curr_count = hmap.get(fruits[i]);
        curr_count--;
        hmap.put(fruits[i],curr_count);
        count--;
       }

       if(hmap.get(fruits[i])==0){
         hmap.remove(fruits[i]);
         
       } 

        i++;
       }

         j++;

       }
        
    }
  return result;
    
}
}

// Time Complexity = O(n);
// Space Complexity = O(no of baskets);
