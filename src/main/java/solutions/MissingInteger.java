package solutions;

import java.util.HashSet;

public class MissingInteger {

    public static void main(String[] args) {
        MissingInteger msi = new MissingInteger();
    }

    public int solution(int[] A) {
        HashSet set = new HashSet();
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        for (int i = 1;;i++) {
            if (!set.contains(i)) {
                result = i;
                break;
            }
        }

        return result;
    }
}
