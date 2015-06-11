//https://codility.com/demo/results/demoA2P7VH-83Y/

public class MaxProfit {
	public int solution(int[] A) {
        int len = A.length;
        if (len == 0) {
            return 0;
        }
        int low = A[0];
        int profit = 0;
        for (int i = 0; i < len; i++) {
            if (A[i] < low) {
                low = A[i];
            } else if (A[i] - low > profit) {
                profit = A[i] - low;
            }
        }
        return profit;
    }
}
