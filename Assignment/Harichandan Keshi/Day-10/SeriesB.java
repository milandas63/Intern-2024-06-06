import java.util.Scanner;

public class SeriesB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int start = 5;

        for (int i = 0; i < n; i++) {
            System.out.print((start + 2 * i) + " ");
        }

        scanner.close();
    }
}
