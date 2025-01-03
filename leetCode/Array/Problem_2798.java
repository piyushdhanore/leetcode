package leetCode.Array;

import java.util.Scanner;

public class Problem_2798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int result = numberOfEmployeesWhoMetTarget(arr, target);

        System.out.println(result);

    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int output = 0;

        for (int i : hours) {
            if (i>=target){
                output++;
            }
        }

        return output;
    }
}
