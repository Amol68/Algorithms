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

//-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->-------->


package Sorting;

public class selection_sort {

	public static void main(String[] args) {
		
		String[] arr = {"BAA" , "CAA", "AAA", "ZAA" };
		
		String temp;
		int min;
		
		for(int i=0; i<arr.length; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j].compareTo(arr[i])<0) {
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






//-------->-------->-------->-------->-------->------Kunal Kushwaha Reference-------->-------->-------->-------->-------->-------->



	import java.util.Arrays;

class demo {

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            

            int last = arr.length - i - 1;

            int max = find_max(arr, 0, last);

            swap(arr, max, last);

        }

    }

    static int find_max(int[] arr, int start, int last) {

        int max = start;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
            
        }
        return max;
    }


    static void swap(int[] arr,int max,int last){
         int temp = arr[max];
         arr[max]=arr[last];
         arr[max]=temp;
    }

    

    public static void main(String[] args) {

        int[] arr = { 7, 3, 99, 53, 17 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

}

}
