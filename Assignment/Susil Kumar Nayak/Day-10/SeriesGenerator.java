public class SeriesGenerator {
        public static void main(String[] args) {
            int[] series = new int[10];
            series[0] = 1;
            for (int i = 1; i < series.length; i++) {
                if (i % 2 == 1) {
                    series[i] = series[i - 1] * 2 + 1;
                } else {
                    series[i] = series[i - 1] * 2 - 1;
                }
            }
            for (int number : series) {
                System.out.print(number + " ");
            }
        }
    }
    
