public class calculator {
    public static void main(String[] args) {
        System.out.println(unisum(728394));
        System.out.println(unisum(9778911223L)); 
        System.out.println(unisum(7978168568L)); 
    }

    public static int unisum(long number) {
        while (number >= 10) {
            number = sumOfDigits(number);
        }
        return (int) number;
    }

    private static long sumOfDigits(long number) {
        long sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
