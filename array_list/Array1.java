package array_list;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //		inserting the size of row is necessary,whereas for columns it is not necessary
        int [][] arr = new int[3][];
        System.out.println(arr.length);

        int [][] nums = {

                {1,2,},
                {4,5,6},
                {7,8,9,10,11},
//				individual size of the column can vary
        };
//				here each row contains an array

        System.out.println(nums.length);
//		length will give us the number of rows

        System.out.println(Arrays.toString(nums[0]));

        int[][] arr1 = new int[3][3];

//		how to print a 2D array using for loop
//        input
        for (int row = 0; row < arr1.length; row++) { /* this outer loop is for printing the rows*/

            for (int col = 0; col < arr1[row].length; col++) { /* this inner loop is for printing the column*/
                arr1[row][col] = sc.nextInt();
            }
        }

//        output
        System.out.println("output using 2 for loops");
        for (int row = 0; row < arr1.length; row++) { /* this outer loop is for printing the rows*/

            for (int col = 0; col < arr1[row].length; col++) { /* this inner loop is for printing the column*/
                System.out.print(arr1[row][col]+ " ");
            }
            System.out.println();
        }

//        same output using Arrays.toString() method
        System.out.println("Using Arrays.toString() method");
        for (int row = 0; row < arr1.length; row++) { /* this outer loop is for printing the rows*/

            System.out.println(Arrays.toString(arr1[row]));
        }

        System.out.println("Using enhanced for loop");
//        same output using enhanced for loop
        for(int[] a: arr1) {
            System.out.println(Arrays.toString(a));
        }

    }
}
