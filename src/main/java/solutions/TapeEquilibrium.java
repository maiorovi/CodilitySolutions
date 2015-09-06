package solutions;

public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 4, 3};
        TapeEquilibrium te = new TapeEquilibrium();
        System.out.println(te.solution(arr));
    }

    public int solution(int[] A) {
        int summ = 0, result = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++)
            summ += A[i];
        int temp = 0;

        for (int i = 0; i < A.length - 1; i++) {
            temp += A[i];
            summ = summ - A[i];
            if (Math.abs(summ - temp) < result)
                result = Math.abs(summ - temp);
        }

        return result;
    }
}
