package solutions;

public class CountDiv {

    public static void main(String[] args) {
        System.out.println(new CountDiv().solution(0, 2000000000, 1));
    }

    public int solution(int A, int B, int K) {
        int counter = 0;
        int val = 0;

        if (A == B) {
              return A %  K == 0 ? 1 : 0;
        }

        if (A != 0) {
            val = A - 1;
        } else {
            val = A;
        }

        counter += B / K -  val / K;

        if (A == 0)
            counter++;

        return counter;
    }
}
