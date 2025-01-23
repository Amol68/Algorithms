// Explanation (Opltimal Approach):

{/*
 N = 5, array[] = {7,2,1,5,4}
We initialize leftSum =0. Because for index =0 the leftSum is 0 totalSum for this array is 7+2+1+5+4=19

At index=0, leftSum=0 and  totalSum-array[index] = 19-7 = 12
Now leftSum and totalSum(which works as rightSum in this case) is not equal . We add array[index] to leftSum , leftSum =7 and  , move index++

At index=1, leftSum=7 and  totalSum-array[index] = 12-2 = 10
Now leftSum and totalSum(which works as rightSum in this case) is not equal . We add array[index] to leftSum , leftSum is 7+2=9 and move index++

At index=2, leftSum=9 and  totalSum-array[index] = 10-1 = 9
Now leftSum and totalSum is  equal . We save index as ans and break;
*/}

class Main {
    public static void main(String[] args) {
        
       int[] arr = {1, 7, 3, 6, 5, 6};
       
       int left_sum = 0;
       int  array_sum = 0;
       int ans = -1;
       
       for(int i=0; i<arr.length; i++){
           array_sum+=arr[i];
       }
       
       for(int i=0; i<arr.length; i++){
           array_sum -= arr[i];
           
           if(array_sum == left_sum){
               ans = i;
               break;
           }
           left_sum += arr[i];
       }
       
       if(ans != -1) System.out.println("Equilibrium:" +ans);
       else System.out.println("No Equilibrium");
       
       
    }
}

// TC : O(n);
// SC : O(1);
