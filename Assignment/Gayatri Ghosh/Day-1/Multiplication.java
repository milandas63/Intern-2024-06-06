public class Multiplication{
    public static void main(String[]args){
        for(int j=2;j<=40;j+=4){
            for(int i=1;i<=10;i++){
                for(int k=j;k<=(j+3);k++){
                    if(k<=40)
                        System.out.print(k+" x "+i+" = "+(k*i)+"    ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}