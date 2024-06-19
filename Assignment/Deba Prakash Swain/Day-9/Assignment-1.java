public class Question4_Partten {
    public static void main(String[] args) {
        int height = 10;
        int lastLine = 2 * height - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < lastLine; j++) {
                if (j == height - 1 - i || j == height - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < lastLine; i++) {
            System.out.print("*");
        }
    }
}
