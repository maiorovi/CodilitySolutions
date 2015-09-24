package solutions;

public class PassingCars {

    public int solution(int[] A) {
        int count = 0;
        int count_zeros = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                count_zeros++;
            if (A[i] == 1)
                count += count_zeros * 1;
        }

        if (count < 0 || count > 1000000000)
            return -1;
        return count;
    }
}
