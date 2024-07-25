
public class NumberPattern {

	public static void main(String[] args) {
		int r = 10;
		int s=r;
		/*for(int m=0;m<=10;m++)System.out.print(" ");
		System.out.println("0");*/
		for(int i=1;i<r;i++) {
			for(int j=0;j<s;j++) {
				System.out.print(" ");
			}
			s--;
			for(int k=1;k<(2*i)+1;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
