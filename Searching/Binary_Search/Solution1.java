package Binary_search;

public class solution1 {

	public static void main(String[] args) {

		int[] arr = {2,4,6,8,9,10,11,13,14};
		int item = 12;
		
		int li = 0;
		int hi = arr.length-1;
		int mi = (li+hi)/2;
		
		while(li<=hi) {
			
			if(arr[mi]==item) {  
				System.out.println("Element is at position:"+mi);
				break;
			}
			
			else if(arr[mi]<item) {  // if item is greater than mid element , consider onle right part of array 
			   li=mi+1;	
			}
			
			else {   // if item is smaller than mid element , consider onle left part of array 
				hi=mi-1;
			}
			
			mi=(li+hi)/2;
		}
		
		if(li>hi) {
			System.out.println("Element not found");
		}
		
		
		
	}

}
