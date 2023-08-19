package Sorting;

public class selection_sort {

	public static void main(String[] args) {
		
		int[] arr = {3,28,55,9,33,76,29};
		
		int temp=0 , min;
		
		for(int i=0; i<arr.length; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j]<arr[i]) {
					min = j;
				}
				
			}
			temp = arr[i];
			arr[i]=arr[min];
			arr[min] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
