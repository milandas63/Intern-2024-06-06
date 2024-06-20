import java.io.PrintStream;
class Pyramid {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        PrintStream x = System.out;
        x.println("This line is printed with x reference");

        int spaces = 30;
        int stars = 1;
        for(int i=0; i<10; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");  // Corrected to print space on the same line
            }
            for(int j=0; j<stars; j++) {
                System.out.print("*");  // Corrected to print stars on the same line
            }
            System.out.println();  // Move to the next line after printing stars
            spaces--;  // Decrease the number of spaces
            stars += 2;  // Increase the number of stars
        }
    }
}
