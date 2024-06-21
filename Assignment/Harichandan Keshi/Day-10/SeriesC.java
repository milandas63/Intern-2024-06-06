import java.util.Scanner;

public class SeriesC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int[] series = new int[n];
        series[0] = 2;

        for (int i = 1; i < n; i++) {
            series[i] = series[i - 1] + (i + 2);
        }

        for (int num : series) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
