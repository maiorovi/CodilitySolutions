package solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FrogRiverOne {
    public static void main(String[] args) {

    }

    public int solution(int X, int[] A) {
        HashSet list = new HashSet<Integer>();
        int result = -1;

        if (A.length < X) {
            return -1;
        }

        for (int i = 1; i <= X; i++) {
            list.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            Integer currElem = A[i];

            if (list.contains(currElem)) {
                list.remove(A[i]);
            }

            if (list.isEmpty()) {
                result = i;
                break;
            }
        }

        return result;
    }
}
