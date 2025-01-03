package Strings_Basics;

public class RotateString {
    public static void main(String[] args) {

    }


    public static String isRotate(String s){
        String rot = ""+s.charAt(s.length()-1);

        for (int i =0; i<s.length()-1; i++){
            rot+= s.charAt(i);
        }

        return rot;
    }
}
