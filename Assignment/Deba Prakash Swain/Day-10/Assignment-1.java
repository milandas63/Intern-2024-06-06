public class Day10_Series {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i=0;i< arr.length;i++){
            arr[i]=i+1;
        }
        System.out.println("Series is: ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
