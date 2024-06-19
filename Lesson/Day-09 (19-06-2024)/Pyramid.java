import java.io.PrintStream;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        PrintStream x = System.out;
        x.println("This line is printed with x reference");

        int spaces = 30;
        int stars = 1;
        for(int i=0; i<10; i=i+1) {
            for(int j=0; j<spaces; j++) System.out.print(" ");
            for(int j=0; j<stars; j++)  System.out.print("*");
            System.out.println();
            spaces--; stars += 2;
        }
    }
}

/*
                              *
                             ***
                            *****

*/