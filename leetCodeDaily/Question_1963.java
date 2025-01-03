package leetCodeDaily;

import java.util.Scanner;

public class Question_1963 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        System.out.println(minSwaps(s));
    }

    public static int minSwaps(String s) {

        int openCount = 0;
        int imbalance = 0;
        for (char ch : s.toCharArray()){
            if (ch == '['){
                openCount++;
            }
            else if (ch == ']'){
                if (openCount>0){
                    openCount--;
                }
                else{
                    imbalance++;
                }
            }
        }
        return (imbalance+1)/2;
    }
}
