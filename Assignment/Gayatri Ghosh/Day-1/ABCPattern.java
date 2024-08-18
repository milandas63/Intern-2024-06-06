
public class ABCPattern {

	public static void main(String[] args) {
		int spaces = 40;
		int rows = 10;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<spaces;j++) {
				System.out.print(" ");
			}
			for(char ch='a';ch<=('a'+i);ch++) {
				System.out.print(ch);
			}
			for(char ch=(char)('a'+i-1);ch>='a';ch--) {
				System.out.print(ch);
			}
			System.out.println();
			spaces--;
		}
	}
}
