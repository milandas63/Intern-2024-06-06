public class CompleteSeries {
    public static void main(String[] args) 
    {
        int[] series = {2, 5, 9, 14, 20};
        int n = 10;
        int[] completeSeries = new int[n];
        for(int i = 0; i < series.length; i++)
         {

            completeSeries[i] = series[i];
        }
        for(int i = series.length; i < n; i++) {
            int nextDifference = (completeSeries[i - 1] - completeSeries[i - 2]) + 1;
            completeSeries[i] = completeSeries[i - 1] + nextDifference;
        }
        for(int num : completeSeries) {
            System.out.print(num + " ");
        }
    }
}