package leetCode.Array;

import java.util.Scanner;

public class Problem_2529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = maximumCount(arr);

        System.out.println("The maximum count among them is: "+max);
    }

    public static int maximumCount(int[] nums) {

        int neg = 0, pos = 0;

        for (int num : nums) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }

        return Math.max(pos, neg);

    }
}
