package Sorting;

public class bubble_sort {

	public static void main(String[] args) {
		
		int[] arr = {1,3,17,11,98,45};
		int temp;
		
		for(int i=0; i<arr.length; i++) {   // outer for loop to traverse till last element
			int flag=0;
			for(int j=0; j<arr.length-1-i; j++) {
				
				if(arr[j]>arr[j+1]) {  // swapping using temp
				  temp = arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
				  flag=1;
				}
				
			}
			if(flag==0) {
				break;
			}
			
			
		}
		
		for(int i=0; i<arr.length; i++) {
		  System.out.println(arr[i] +" ");
		}

	}

}



------------->------------->------------->------------->------------->------------->------------->------------->------------->


	package Sorting;

public class bubble_sort {

	public static void main(String[] args) {
		
		String[] arr = {"BAA" , "CAA", "AAA", "ZAA" };
		String temp;
		
		for(int i=0; i<arr.length; i++) {  
			int flag=0;
			for(int j=0; j<arr.length-1-i; j++) {
				
				if(arr[j].compareTo(arr[j+1])>0) {
				  temp = arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
				  flag=1;
				}
				
			}
			if(flag==0) {
				break;
			}
			
			
		}
		
		for(int i=0; i<arr.length; i++) {
		  System.out.println(arr[i] +" ");
		}

	}

}


// ------->------->------->------->------->Kunal Kushwaha's Reference ------->------->------->--------->------->------->------->


import java.util.*;
class HelloWorld {
    
      public static void main(String[] args) {
        
        int[] arr = {23,1,67,34,90,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
  static void bubble(int[] arr){
      
      for(int i=0; i<arr.length; i++){
          for(int j=1; j<arr.length-i; j++){
              
              if(arr[j]<arr[j-1]){
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
              }
              
          }
      }
  }
    
  
    
}

// Space Comlexity: O(1)
// Time Complexity:
//   Worst Case: O(n2)
//   Best Case: O(n)
