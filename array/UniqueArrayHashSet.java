package array;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueArrayHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if (isUnique(arr)) System.out.println("The array is unique");
        else System.out.println("The array is not unique");

    }

    public static boolean isUnique(int[] nums){

        HashSet<Integer> seen = new HashSet<>();

        for (int n: nums){
            if (seen.contains(n)){
                return false;
            }

            seen.add(n);
        }

        return true;
    }
}
