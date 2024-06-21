import java.util.Scanner;

public class SeriesD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int[] series = new int[n];
        series[0] = 1;
        if (n > 1) {
            series[1] = 3;
        }

        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                series[i] = series[i - 1] * 2 - 1;
            } else {
                series[i] = series[i - 1] * 2 + 1;
            }
        }

        for (int num : series) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
