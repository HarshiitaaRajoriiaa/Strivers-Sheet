package Step03_Arrays_40.Easy_14;

public class RotateArrayBy1Place {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 9, 3, 0 };
        rotateArrayByOne(arr);
    }

    //*TC = 0(N) and SC = 0(1) / here space using by algorithm is N but but nothing is extra , it is using space of array itself to play around
    public static void rotateArrayByOne(int[] arr) {
        // Your code here
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
