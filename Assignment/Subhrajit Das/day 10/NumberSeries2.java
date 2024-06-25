public class NumberSeries {
    public static void main(String[] args) {
        int[] series = new int[10];
        for (int i = 0; i < 10; i++) {
            series[i] = i + 1;
        }
        for (int num : series) {
            System.out.print(num + " ");
        }
    }
}
