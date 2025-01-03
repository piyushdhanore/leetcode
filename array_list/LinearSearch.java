package array_list;

public class LinearSearch {
    public static void main(String[] args) {

        int [] ar = {9,4,8,16,23,52};
        System.out.println(searchElement(ar,23));
    }

    public static boolean searchElement(int[] ar, int search){
        int i;
        for (i = 0; i<ar.length; i++) {
            if (ar[i]==search){
                System.out.println("Element found at index: "+i);
                return true;
            }
        }
        if (i==ar.length){
            System.out.println("Element not found");
        }
        return false;
    }
}
//search for character, decimal, long,String, object
