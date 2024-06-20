public class SeriesCompletion {

    public static void main(String[] args) {
        // Series a: 1, 2, 3, 4, 5, ...
        int[] seriesA = completeSeriesA(10);
        System.out.println("Series a:");
        printSeries(seriesA);

        // Series b: 5, 7, 9, 11, 13, ...
        int[] seriesB = completeSeriesB(10);
        System.out.println("\nSeries b:");
        printSeries(seriesB);

        // Series c: 2, 5, 9, 14, 20, ...
        int[] seriesC = completeSeriesC(10);
        System.out.println("\nSeries c:");
        printSeries(seriesC);

        // Series d: 1, 3, 5, 11, 21, ...
        int[] seriesD = completeSeriesD(10);
        System.out.println("\nSeries d:");
        printSeries(seriesD);

        // Series e: 1, 2, 6, 42, 1806, ...
        long[] seriesE = completeSeriesE(10);
        System.out.println("\nSeries e:");
        printSeries(seriesE);
    }

    // Complete Series a: 1, 2, 3, 4, 5, ...
    public static int[] completeSeriesA(int n) {
        int[] series = new int[n];
        for (int i = 0; i < n; i++) {
            series[i] = i + 1;
        }
        return series;
    }

    // Complete Series b: 5, 7, 9, 11, 13, ...
    public static int[] completeSeriesB(int n) {
        int[] series = new int[n];
        int start = 5;
        for (int i = 0; i < n; i++) {
            series[i] = start + 2 * i;
        }
        return series;
    }

    // Complete Series c: 2, 5, 9, 14, 20, ...
    public static int[] completeSeriesC(int n) {
        int[] series = new int[n];
        series[0] = 2;
        int increment = 3;
        for (int i = 1; i < n; i++) {
            series[i] = series[i - 1] + increment;
            increment++;
        }
        return series;
    }

    // Complete Series d: 1, 3, 5, 11, 21, ...
    public static int[] completeSeriesD(int n) {
        int[] series = new int[n];
        series[0] = 1;
        int increment = 2;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                series[i] = series[i - 1] + increment;
            } else {
                series[i] = series[i - 1] + increment - 1;
            }
            increment++;
        }
        return series;
    }

    // Complete Series e: 1, 2, 6, 42, 1806, ...
    public static long[] completeSeriesE(int n) {
        long[] series = new long[n];
        series[0] = 1;
        long nth = 1;
        for (int i = 1; i < n; i++) {
            nth = nth * (i + 1) + (i + 1);
            series[i] = nth;
        }
        return series;
    }

    // Utility method to print series
    public static void printSeries(int[] series) {
        for (int num : series) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printSeries(long[] series) {
        for (long num : series) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
