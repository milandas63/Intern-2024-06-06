import java.util.Scanner;

public class SeriesE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int[] series = new int[n];
        series[0] = 1;

        for (int i = 1; i < n; i++) {
            series[i] = series[i - 1] * (i + 1) + (i + 1);
        }

        for (int num : series) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
