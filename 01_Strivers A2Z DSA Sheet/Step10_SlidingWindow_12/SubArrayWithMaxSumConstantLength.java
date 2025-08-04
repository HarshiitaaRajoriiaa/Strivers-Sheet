public class SubArrayWithMaxSumConstantLength {
    public static void main(String[] args) {

    }

    public static int maxSum(int arr[], int n, int k) {
        if (n == 0)
            return 0;
        if (n == 1)
            return arr[0];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // while (i < k) {
        // sum += arr[i];
        // i++;
        // }

        int l = 0;
        int r = k-1;
        int max = sum;
        while (r < n-1) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            max = Math.max(max, sum);  
        }
        return max;

    }
}