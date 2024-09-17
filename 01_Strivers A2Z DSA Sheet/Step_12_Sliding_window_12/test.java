public class test {
    public static void main(String[] args) {
        int arr[] = { 1  , 2 ,3,  1, 4, 5, 2, 3, 6 };
        System.out.println(max(arr, 0 , arr.length-1));
    }
    public static int max(int arr[],  int i , int j){
        int num=0;
        for(int k=i;k<=j;k++){
            num = Math.max(num , arr[k]);
        }
        return num;
    }
}
