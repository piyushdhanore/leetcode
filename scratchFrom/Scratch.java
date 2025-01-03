package scratchFrom;

public class Scratch {
    public static void main(String[] args) {

        String s = "hi";

        s = "bye";

        char ch = s.charAt(1);

        System.out.println(ch);

        String new1 = String.valueOf(ch);

        System.out.println(new1);

        System.out.println(s.charAt(1));

        String s1 = ",how are you?";

        System.out.println(s+s1);

        System.out.println("*******************************");

        String s2= "JustIn";

        String s3 = new StringBuilder(s2).reverse().toString();

        System.out.println(s3);

        System.out.println("*******************************");

        String s4 = "abcd#dcba";

        for (int i = 0; i < s4.length(); i++) {
            System.out.print(s4.charAt(i)+" ");
        }
        System.out.println();

        System.out.println("*******************************");

        String s5 = "abcde";

        String reverse = s5.substring(0,3);

        System.out.println(reverse);

        System.out.println("*******************************");

        String s6 = " abcde ";
        System.out.println(s6.trim());


    }
}
