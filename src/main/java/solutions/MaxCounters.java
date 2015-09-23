package solutions;

public class MaxCounters {

    public static void main(String[] args) {

    }

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                counters[A[i] - 1] = counters[A[i] - 1] + 1;
                if (max < counters[A[i] - 1])
                    max = counters[A[i] - 1];
            } else {
                for (int j = 0; j < N; j++) {
                    counters[j] = max;
                }
            }
        }

        return counters;
    }
}
