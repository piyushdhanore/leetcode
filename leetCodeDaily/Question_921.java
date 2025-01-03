package leetCodeDaily;

import java.util.Scanner;

public class Question_921 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parenthesis: ");
        String s = sc.nextLine();

        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {

        int openCount = 0;
        int parenthesis = 0;

        for (char ch : s.toCharArray()){
            if (ch=='('){
                openCount++;
            } else if (ch==')') {
                if (openCount>0){
                    openCount--;
                }
                else{
                    parenthesis++;
                }
            }
        }

        return parenthesis+openCount;
    }
}
