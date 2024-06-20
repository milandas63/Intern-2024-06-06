class Assignment5{
    public static void main(String[] args) {
        long[] arr = new long[10];
        arr[0] = 1;
        for (int i=1;i< arr.length;i++){
            arr[i] = arr[i - 1] * (arr[i - 1]+1);
        }
        System.out.print("Series is: ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}