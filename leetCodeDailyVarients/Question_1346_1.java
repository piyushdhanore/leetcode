package leetCodeDailyVarients;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question_1346_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if(checkIfExist(arr)){
            System.out.println("Double exist");
        } else {
            System.out.println("Double doesn't exist");
        }
    }

    public static boolean checkIfExist(int[] arr) {

        Set<Integer> seen = new HashSet<>();

        for (int num: arr){
            if (seen.contains(2*num) || (num%2==0 && seen.contains(num/2))) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}
