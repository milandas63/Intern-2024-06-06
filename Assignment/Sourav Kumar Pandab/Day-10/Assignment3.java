public class Assignment3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 2;
        for (int i=1;i< arr.length;i++){
           arr[i]=arr[i-1]+(i+2);
        }
        System.out.print("Series is: ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}