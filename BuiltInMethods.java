import java.util.HashSet;

public class BuiltInMethods {
    public static void main(String[] args) {

    }

    public static boolean isUnique(int [] nums){

        HashSet<Integer> seen = new HashSet<>();

        for (int n: nums){

            if (seen.contains(n)){
                return  false;
            }
            seen.add(n);
        }
        return true;
    }
}
