package array;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {

        int[] cc1 = {4321, 3363, 7720, 1294};
        int[] cc2 = {1234, 5678, 4321, 5543};

        System.out.println("Duplicates values present in cc1 are: ");
        isDuplicate(cc1);

        System.out.println("Duplicates values present in cc2 are: ");
        isDuplicate(cc2);

        System.out.println("Duplicates present in cc1 and cc2 are: ");
        isDigitPresent(cc1, cc2);
    }

    public static void isDuplicate(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            String value = String.valueOf(arr[i]);

            for (int j = 0; j < value.length()-1; j++) {
                if (value.charAt(j)==value.charAt(j+1)) {
                    System.out.println("Index "+i+" has duplicate values");
                    break;
                } else if (j==value.length()-1) {
                    System.out.println("Index "+i+" has no duplicate values");
                }
            }
        }
    }

    public static void isDigitPresent(int[] cc1, int[] cc2){

        String [] s1 = new String[cc1.length];

        for (int i = 0; i < s1.length; i++) {
            s1[i] = String.valueOf(cc1[i]);
        }

        String [] s2 = new String[cc2.length];

        for (int i = 0; i < s2.length; i++) {
            s2[i] = String.valueOf(cc2[i]);
        }

        String val = "";


        for (int i = 0; i < s2.length; i++) {
            val+= s2[i];
        }


        for (int i = 0; i < s1.length; i++) {

            boolean flag = false;

            for (int j = 0; j < s1[i].length(); j++) {

                String dup = String.valueOf(s1[i].charAt(j));
                if (val.contains(dup)){
                    flag = true;
                }

            }

            if (flag){
                System.out.println("Digits of "+cc1[i]+" are present in cc2");
            }else {
                System.out.println("Digits of "+cc1[i]+" are not present in cc2");
            }

        }
    }


}
