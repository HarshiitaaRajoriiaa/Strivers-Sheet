public class SubArrayWithLongestLength {
    public static void main(String[] args) {
        
    }
    // sum<=k
    public static int length(int arr[] , int k  ,int n){
        int l=0;
        int r=k-1;
        int sum=0;
        int i=0;
        while( i<k){
            sum+=arr[i];
            i++;
        }
        int max = 0;
        if (sum <= k) max = k;

        while(r<n-1){
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];

            while (sum > k && l <= r) {
                sum -= arr[l];
                l++;
            }

            if (sum <= k) {
                max = Math.max(max, r - l + 1);
            } 
        }
        return max;
    }
}
