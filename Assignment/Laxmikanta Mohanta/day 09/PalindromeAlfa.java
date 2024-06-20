/*public class PallindromAlfa {
    public static void main(String[] args) {
        int spaces = 40;
        for(int i=1; i<=9; i++) {
            for(int j=i; j<spaces; j++) System.out.print(" ");
            for(int j=0; j<=i; j++)     System.out.print((char) 'A'+j);
            for(int j=i-2; j>=0; j--)   System.out.print((char) 'A'+j);
            System.out.println();
            spaces--;
        }
    }

}

*/
public class PalindromeAlfa{
    public static void main(String[] args) {
        int numRows = 9; 
        printPalindromeTriangle(numRows);
    }

    public static void printPalindromeTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            
            for (int j = i; j < numRows; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('a' + j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('a' + j));
            }
            System.out.println();
        }
    }
}
