package Strings_Basics;

public class InterviewQuestion {

    public static void main(String[] args) {

        String s = "nishu";

        search(s);
    }

    public static void search(String name){

        int ans = 0;

        for (int i = 0; i < name.length(); i++) {
            ans++;
        }

        String result = String.join("",name, String.valueOf(ans));

        System.out.println(result);
    }
}
