package leetCode;

/*
    Power of Three
    Given an integer n, return true if it is a power of three. Otherwise, return false.
    An integer n is a power of three, if there exists an integer x such that n == 3x.

    Example 1:
    Input: n = 27
    Output: true
    Explanation: 27 = 3^3

    Example 2:
    Input: n = 0
    Output: false
    Explanation: There is no x where 3x = 0.

    Example 3:
    Input: n = -1
    Output: false
    Explanation: There is no x where 3x = (-1).
 */

public class Question_326 {
    public static void main(String[] args) {

//        int n = 27;
//        int n = 1;
        long n = 2147483647;

        if (isPowerOfThree_1((int) n)) {
            System.out.println(n + " is a power of 3");
        } else {
            System.out.println(n + " is not a power of 3");
        }
    }

    public static boolean isPowerOfThree(int n) {

        long i =0, sum =0;
        while(true){
            sum = (long) Math.pow(3,i);
            System.out.println(sum+" "+i);
            if (sum==n){
                return true;
            } else if (sum>n) {
                return false;
            }
            i++;
        }
    }

    public static boolean isPowerOfThree(long n) {
        long res = 0;

        for (long j = 0; j < n; j++) {
            res = (long) Math.pow(3, j);
            System.out.println(res + " " + j);
            if (res == n) {
                return true;
            } else if (res > n) {
                return false;
            }
        }
        return false;
    }

    public static boolean isPowerOfThree_1(long n) {

        long quo=0,rem=0;

        while(n>0){

            if (n==1) return true;
            else if (quo==1 && rem==0){
                return true;
            }

            quo = n/3;
            rem = n%3;

            n/=3;
        }
        return false;
    }
}
