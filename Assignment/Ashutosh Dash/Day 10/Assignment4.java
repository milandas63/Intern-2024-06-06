public class Assignment4 {
    public static void main(String[] args) {
        
        int[] sequence = new int[10];
        sequence[0] = 1;
        sequence[1] = 3;
        sequence[2] = 5;
        sequence[3] = 11;
        sequence[4] = 21;
        
       
        for (int i = 5; i < 10; i++) {
            sequence[i] = sequence[i - 1] + (sequence[i - 1] - sequence[i - 2]);
        }

     
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}
