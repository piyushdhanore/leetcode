package array_list;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(56);
        list.add(45);
        list.add(36);
        list.add(86);
        list.add(96);

        System.out.println(list);

        list.set(2, 69);

        System.out.println(list);

        list.remove(3);

        System.out.println(list);


    }
}
