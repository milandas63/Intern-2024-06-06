public class Assignment3 {
    public static void main(String[] args) {
        
        int number = 2;
        
        int count = 10;
        
        int increment = 3;
        System.out.print(number);
        for (int i = 1; i < count; i++) {
            number += increment;
            System.out.print(", " + number);
            increment++; 
        }
    }
}
