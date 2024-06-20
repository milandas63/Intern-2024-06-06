
public class AlphaOccurances {

	public static void main(String[] args) {
		String text = "This text will be taken from user";

		//int count[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] count = new int[26];
		for(int i=0; i<count.length; i++) count[i] = 0;
		
		char each;
		for(int i=0; i<text.length(); i++) {
			each = text.charAt(i);
			if(each>=65 && each<=90) {
				count[each-65]++;
			} else if(each>=97 && each<=122) {
				count[each-97]++;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]>0) {
				System.out.println((char)(i+65) + " = " + count[i]);
			}
		}
	}

}
