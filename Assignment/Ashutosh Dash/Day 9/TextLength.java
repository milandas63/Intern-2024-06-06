
public class TextLength {

	public static void main(String[] args) {
		String text = "IIG Varsity";
		
		Stretch ss = new Stretch();
		
		System.out.println(ss.padRight(text, 50, '-'));
		System.out.println(ss.padCenter(text, 50, '-'));
		System.out.println(ss.padLeft(text, 50, '-'));
	}
}


class Stretch {
	public String stretch(String text, int length, char padSide, char padChar) {
		String retVal = text;
		for(int i=text.length(); i<length; i++) {
			switch(padSide) {
			case 'R': retVal = retVal+padChar;
			          break;
			case 'C': if(i%2==0) {
     					  retVal = retVal+padChar;
			          } else {
			        	  retVal = padChar+retVal;
			          }
			          break;
			case 'L': retVal = padChar+retVal;
			          break;
			}
		}
		return retVal;
	}

	public String padRight(String text, int length) {
		return stretch(text, length, 'R', ' ');
	}

	public String padRight(String text, int length, char padChar) {
		return stretch(text, length, 'R', padChar);
	}

	public String padCenter(String text, int length) {
		return stretch(text, length, 'C', ' ');
	}

	public String padCenter(String text, int length, char padChar) {
		return stretch(text, length, 'C', padChar);
	}

	public String padLeft(String text, int length) {
		return stretch(text, length, 'L', ' ');
	}

	public String padLeft(String text, int length, char padChar) {
		return stretch(text, length, 'L', padChar);
	}
}