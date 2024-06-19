public class StaredgePattern {
    public static void main(String[] args) {
        int n = 10; 
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j < 2 * (i - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2 * (n - 1) + 1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
