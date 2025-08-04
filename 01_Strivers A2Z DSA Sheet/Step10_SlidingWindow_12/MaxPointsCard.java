public class MaxPointsCard {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lSum = 0;
        int i = 0;

        // Take the first k cards from the left
        while (i < k) {
            lSum += cardPoints[i];
            i++;
        }

        int maxSum = lSum;
        int rSum = 0;
        int left = k - 1;
        int right = n - 1;

        // Shift one card at a time from left to right
        while (left >= 0) {
            lSum -= cardPoints[left]; // remove from the left
            rSum += cardPoints[right]; // add from the right
            maxSum = Math.max(maxSum, lSum + rSum);

            left--;
            right--;
        }

        return maxSum;
    }
}
