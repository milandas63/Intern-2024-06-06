
public class ArithmeticSeries {
    public static void main(String[] args) {
        int start = 5;
        int difference = 2;
        int terms = 10;        
        for (int i = 0; i < terms; i++) {
            System.out.print(start +(i * difference) + " ");
        }
    }
}
