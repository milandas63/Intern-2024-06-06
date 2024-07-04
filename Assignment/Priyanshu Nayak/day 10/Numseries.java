
public class Numseries {
    public static void main(String[] args) {
        long[] series = new long[10];
        series[0] =1;
        series[1] = 2;
        series[2] = 6;
        series[3] = 42;
        series[4] = 1806;
        for (int n = 5; n < 10; n++) {
            series[n] = (n + 1) * series[n - 1] + series[n - 1];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(series[i]);
        }
    }
}
