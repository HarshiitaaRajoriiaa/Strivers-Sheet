package Step04_BinarySearch_32.BS_as_Technique;

public class Sqrt {
    public static void main(String[] args) {
        
    }
    int floorSqrt(int n) {
        // Your code here
        return helper(n , 1 , n );
    }
    public static int helper(int n , int low , int high ){
        int sqrt = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid*mid == n) sqrt = mid;
            if(mid*mid > n ) high = mid-1;
            else {
                sqrt = mid;
                low = mid+1;
            }
        }
        return sqrt;
    }
}
