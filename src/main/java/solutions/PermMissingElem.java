package solutions;

public class PermMissingElem {

    public static void main(String[] args) {
        PermMissingElem elem = new PermMissingElem();
        elem.solution(new int[]{2, 3, 1, 5});
    }

    public int solution(int[] A) {
        int summ = 0;
        int summ1 = A.length*2 +1;
        for(int i = 0; i < A.length; i++) {
            summ += A[i];
            summ1 += i;
        }
        return summ1 - summ;
    }
}
