public class Question5_Partten{
    public static void main(String[] args){
        int height = 10;

        for (int i=0;i<height;i++){
            for (int j=0;j<height-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print((char)('a' + j));
            }
            for (int j=i-1;j>=0;j--){
                System.out.print((char)('a'+j));
            }
            System.out.println();
        }
    }
}
