// c)  2,  5,  9,  14,   20, ......
public class Assignment3 {
    public static void main(String[] args) {
        int n=10;
        int term = 2;
        int increment = 3;

        for(int i=1;i<=n;i++){
            if(i == 1){
                System.out.print(term+",");
            }
            else{
                term+=increment;
                increment++;
                System.out.print(term+",");

            }
        }
        System.out.println();
        }
    }
