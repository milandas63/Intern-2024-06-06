public class MultiplicationTable{
    public static void main(String[] args) {
        int startTable = 2; 
        int endTable = 40; 
        int tablesPerRow = 5; 

        for (int i = startTable; i <= endTable; i += tablesPerRow) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 0; k < tablesPerRow; k++) {
                    if (i + k <= endTable) {
                        System.out.printf("%2d x %2d = %4d   ", i + k, j, (i + k) * j);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}