public class Day10_Series {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        for (int i=3;i< arr.length;i++){
            arr[i] = arr[i - 1] + (arr[i - 1] - arr[i - 2] + 4);
        }
        System.out.print("Series is: ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
