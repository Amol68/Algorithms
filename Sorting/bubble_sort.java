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
