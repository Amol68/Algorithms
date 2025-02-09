// Problem Description: https://www.geeksforgeeks.org/largest-substring-with-same-characters/

class Main {

  public static int find_longest(String str){
      
      if(str=="") return 0;
      
      if(str.length()==1) return 1;
      
      if(str.length()==2 && str.charAt(0)==str.charAt(1)) return 2;
     
      
       int temp=1; int ans=1;
     
     for(int i=1; i<str.length(); i++){
         
         if(str.charAt(i)==str.charAt(i-1)) temp++;
         
         else{
             ans=Math.max(ans,temp);
             temp=1; 
         }
     }
     
     ans = Math.max(ans,temp);
     
     return ans;
  }     
    
    public static void main(String[] args) {
         String s = "abcdddddeff";
         System.out.println("Answer:" +find_longest(s));
    }
}

{/* 
 Time Complexity: O(N)
Auxiliary Space: O(1)
*/}
