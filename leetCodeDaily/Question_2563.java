package leetCodeDaily;

import java.util.Scanner;

public class Question_2563 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] nums = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the lower limit");
        int lower = sc.nextInt();

        System.out.println("Enter the upper limit");
        int upper = sc.nextInt();

        long result = countFairPairs(nums, lower, upper);

        System.out.println("The number of fair pairs in the given array are: "+result);
        sc.close();
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {

        long output = 0;

        for (int i=0; i<nums.length;i++){

            int num1 = nums[i];

            for (int j = i+1; j < nums.length; j++) {

                int num2 = nums[j];

                int num3 = num1+num2;

                if (lower<=num3 && num3<=upper){
                    output++;
                }
            }
        }


        return output;
    }
}
