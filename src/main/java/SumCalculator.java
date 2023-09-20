public class SumCalculator {
    public int sum(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException();
        }
        int buf = 0;
        for (int i = 1; i <= num; i++) {
            buf += i;
        }
        return buf;
    }
}
