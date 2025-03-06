package array;

public class TwoDArray_EnhancedForLoop {
    public static void main(String[] args) {

        int[][] arr = {{1,2},{3,4},{5,6}};

        for(int[] ints: arr) {
            for (int num: ints){
                System.out.println(num);
            }
        }
    }
}
