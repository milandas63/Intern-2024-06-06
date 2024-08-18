
public class NumberPattern {

	public static void main(String[] args) {
		int r = 10;
		for(int i=1;i<r;i++) {
			for(int j=0;j<r-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print(i+"");
			}
			System.out.println();
		}
	}

}
