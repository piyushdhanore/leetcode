/*
135. Candy

There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

Example 1:
Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.

Example 2:
Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
 */

import java.util.Arrays;

public class Question_135 {
    public static void main(String[] args) {

//        int [] ratings = {1,0,2};
//        int [] ratings = {1,2,2};
//        int [] ratings = {1,2,87,87,87,2,1};
        int [] ratings = {1,3,2,2,1};

        System.out.println(candy2(ratings));
    }

    public static int candy(int[] ratings) {

//        int length = ratings.length;

        int candy = ratings.length;

        for (int i = 0; i < ratings.length-1; i++){

            if(ratings[i]>ratings[i+1]){
                ++candy;
            } else if (i>0) {
                if (ratings[i-1]<ratings[i] && ratings[i]<ratings[i+1]){
                    candy+=2;
                } else if (ratings[i-1]>ratings[i]) {
                    continue;
                } else if (ratings[i]>=ratings[i+1] || ratings[i]<=ratings[i+1]){
                    candy++;
                }
            }

//            if (i==ratings.length-2 && ratings[i]<=ratings[ratings.length-1]){
//                ++candy;
//            }
        }

        return candy;
    }

    public static int candy2(int[] ratings) {

        int n = ratings.length;

        int [] candies = new int[n];
        Arrays.fill(candies,1);

        for (int i = 1; i <n ; i++) {
            if (ratings[i]>ratings[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }

        for (int i = n-2; i>=0; i--) {
            if (ratings[i]>ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1]+1);
            }
        }

        int total = 0;
        for(int i : candies){
            total+=i;
        }

        return total;
    }
}
