package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list of integer: ");

        ArrayList<Integer> list = new ArrayList<>();

//        input
        for (int i =0; i<5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);
        
//        get item ay any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] will not work here
        }

        sc.close();
    }

}
