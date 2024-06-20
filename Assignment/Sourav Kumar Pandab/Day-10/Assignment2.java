 class Assignment2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int difference = 2;
        for (int i=0;i< arr.length;i++){
           arr[i]=5+i*difference;
        }
        System.out.print("Series is: ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}