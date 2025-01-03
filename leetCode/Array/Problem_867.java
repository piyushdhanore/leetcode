package leetCode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_867 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rowsize of the matrix: ");
        int row = sc.nextInt();

        System.out.println("Enter the columnsize of the matrix: ");
        int column = sc.nextInt();

        int [][] arr = new int[row][column];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] result = transpose(arr);

        //one way to print 2D matrix
        System.out.println(Arrays.deepToString(result));

        System.out.println("Another way to print matrix");

        //another way to print 2D matrix
        for (int[] rows : result) {
            System.out.println(Arrays.toString(rows));
        }


    }

    public static int[][] transpose(int[][] matrix) {

        int R = matrix.length; int C = matrix[0].length;

        int [][] ans = new int[C][R];

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {

                ans[c][r] = matrix[r][c];
            }
        }
        return ans;
    }
}
