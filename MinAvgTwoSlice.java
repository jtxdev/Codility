// Author: Jason Thai
// Adapted from http://codesays.com/2014/solution-to-min-avg-two-slice-by-codility/
// https://codility.com/demo/results/demoQESKZD-P56/

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int len = A.length;
        int bestindex = 0;
        double best = (A[0] + A[1]) / 2;
        for (int i = 0; i < len - 1; i++) {
            if ((A[i] + A[i+1])/2.0 < best) {
            	best = (A[i] + A[i+1])/2.0;
            	bestindex = i;
            }
            if (i < len - 2) {
	            if ((A[i] + A[i+1] + A[i+2])/3.0 < best) {
	            	best = (A[i] + A[i+1] + A[i+2])/3.0;
	            	bestindex = i;
	            }
            }
        }
        return bestindex;
    }
}
