public class DigitToWordsConverter {


    public static String convertDigitsToWords(int number) {
        
        String[] digitWords = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

      
        String numStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < numStr.length(); i++) {
            char digitChar = numStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            
            result.append(digitWords[digit]);

           
            if (i != numStr.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
       
        int number1 = 12345;
        int number2 = 03786; 
        int number3 = 72913;


        System.out.println(number1 + " = " + convertDigitsToWords(number1));
        System.out.println(number2 + " = " + convertDigitsToWords(number2));
        System.out.println(number3 + " = " + convertDigitsToWords(number3));
    }
}
