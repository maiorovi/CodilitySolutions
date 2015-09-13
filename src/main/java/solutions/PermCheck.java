package solutions;

import java.util.HashSet;

public class PermCheck {

    public static void main(String[] args) {
        PermCheck check = new PermCheck();
        System.out.println(check.solution(new int[]{1,5}));
    }

    public int solution(int[] A) {
        HashSet set = new HashSet();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        for (int i = 0; i < A.length; i++) {
                if (!set.contains(i+1)) {
                    return 0;
                }
        }

        return 1;
    }
}
