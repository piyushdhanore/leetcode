package leetCode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

                arr[i] = sc.nextInt();
        }

        System.out.println("Enter the integer to be searched: ");
        int target = sc.nextInt();

        System.out.println("Array: " + Arrays.toString(arr));

        int result = search(arr, target);

        if(result==-1){
            System.out.println(-1);
        } else{
            System.out.println(result);
        }
        sc.close();
    }

    public static int search(int[] arr, int search){

        for (int i=0; i<arr.length; i++) {
            if (arr[i]==search){
                return i;
            }
        }
        return -1;
    }
}
/*
   public static int search(int[] nums, int target) {
        int x = 0 ;
	    for (int i = 0; i < nums.length; i++) {
	    	if (nums[i]==target) {
				x = nums[target];
	    			break;
			}
	    	else {
                x = -1;
			}
		}
	    return x;
    }

    public static void main(String[] args) {
        int[] ar = {45,9,23,3,81,7,6,0,4,5};
	    int search = 6;
	    Arrays.sort(ar);
	    int result = search(ar, search);

	    if(result == -1) {
	            System.out.println(-1);
	        }
	    else {
	        	System.out.println("The element is present at index "+search+" is: "+result);
	        }
    }
 */
