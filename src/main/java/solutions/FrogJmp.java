package solutions;

public class FrogJmp {
    public static void main(String[] args) {

    }

    public int solution(int X, int Y, int D) {
        return (int)Math.ceil((double)(Y-X) / (double)D);
    }
}
