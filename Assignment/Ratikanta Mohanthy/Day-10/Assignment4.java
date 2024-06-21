public class Assignment4 {
    public static void main(String[] args) {
        
        int numTerms = 5;
        int n = 1;
        int[] sequence = new int[numTerms];
        
        sequence[0] = n;

        for (int i = 1; i < numTerms; i++) {
            if (i % 2 == 1) {
                sequence[i] = sequence[i - 1] * 2 - 1;
            } else {
                sequence[i] = sequence[i - 1] * 2 + 1;
            }
        }

        System.out.print("Generated Sequence: ");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(sequence[i]);
            if (i != numTerms - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
