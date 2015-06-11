// Author: Jason Thai 11/06/2015
// Adapted from stackoverflow
// https://codility.com/demo/results/demoM4Y2BK-JMB/

import java.lang.Math;

public class MaxDoubleSliceSum {
	public int solution(int[] A) {
        int[] mss = new int[A.length];
        int[] mse = new int[A.length];
        

        for (int i = 1; i < A.length; i++) {
            mse[i] = Math.max(0, mse[i-1] + A[i]);
        }
        for (int i = A.length - 2; i >= 0; i--) {
            mss[i] = Math.max(0, mss[i+1] + A[i]);
        }
        int max_slice = -10001;
        for (int i = 1; i < A.length - 1; i++) {
            if (mse[i-1] + mss[i+1] > max_slice) {
                max_slice = mse[i-1] + mss[i+1]; 
            }
        }
        return max_slice;
    }
}
