public class Diamond {
    public static void main(String[] args) {
        int spaces = 40;
        int stars = 1;
        for(int i=0; i<19; i++) {
            for(int j=0; j<spaces; j++) System.out.print(" ");
            for(int j=0; j<stars; j++)  System.out.print("*");
            System.out.println();
            if(i<9) {
                spaces--; stars+=2;
            } else {
                spaces++; stars-=2;
            }
        }
    }
}
