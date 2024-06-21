public class Assignment5 {
    public static void main(String[] args) {
    
        long[] sequence = new long[10];
        sequence[0] = 1;
        sequence[1] = 2;
        sequence[2] = 6;
        sequence[3] = 42;
        sequence[4] = 1806;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Term " + (i+1) + ": " + sequence[i]);
        }
        for (int i = 5; i < 10; i++) {
        
            sequence[i] = someFunction(i);  
            System.out.println("Term " + (i+1) + ": " + sequence[i]);
        }
    }
    public static long someFunction(int index) {

        return factorial(index);
    }
    public static long factorial(int n) {
        if (n == 0) return 1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
