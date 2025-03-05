package leetCodeDaily;

/*
    Check if Number is a Sum of Powers of Three
    Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.
    An integer y is a power of three if there exists an integer x such that y == 3x.

    Example 1:
    Input: n = 12
    Output: true
    Explanation: 12 = 31 + 32

    Example 2:
    Input: n = 91
    Output: true
    Explanation: 91 = 30 + 32 + 34

    Example 3:
    Input: n = 21
    Output: false
 */

import java.util.ArrayList;
import java.util.List;

public class Question_1780 {
    public static void main(String[] args) {

        int n = 21;

        if (checkPowersOfThree(n)) {
            System.out.println(n + " is sum of power of 3");
        } else {
            System.out.println(n + " is not a sum of power of 3");
        }

    }

    public static boolean checkPowersOfThree(int n) {

        List<Integer> s = new ArrayList<>();

        int temp = n, sum =0;

        while(n>0){
            int rem = n%3;
            if (rem > 1) {
                return false; // If the remainder is 2, it's not a sum of distinct powers of three
            }
            s.add(rem);
            n/=3;
        }

        System.out.println(s);

        for (int i = 0; i < s.size(); i++) {
            sum+=s.get(i)*pow(3,i);
        }

        System.out.println(sum);

        return sum == temp;
    }

    public static int pow(int base, int raise){

        int power = 1;
        for (int i = 0; i <raise; i++) {
            power*=base;
            System.out.println("power is: "+power);
        }

        return power;
    }
}
