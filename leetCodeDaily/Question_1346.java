package leetCodeDaily;

import java.util.Scanner;

public class Question_1346 {
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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i]==2*arr[j] && i!=j) {
                    return true;
                }
            }
        }

        return false;
    }
}
