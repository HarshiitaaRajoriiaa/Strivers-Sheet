public class test {
    public static void main(String[] args) {
        // printNumbers(4);
        int arr[] = {10 , 16 , 0 , 3 , 2 , -1 , 8 , 10, 2 , 7 };
        for(int i=0;i<=arr.length-2;i++){
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
