// https://codility.com/demo/results/demo8NRQZY-25H/

import java.lang.Math;

public class MaxSliceSum {
    public int solution(int[] A) {
        int max_ending = A[0];
        int max_slice = A[0];
        for (int i = 1; i < A.length; i++) {
            max_ending = Math.max(A[i], max_ending + A[i]);
            max_slice = Math.max(max_slice, max_ending);
        }
        return max_slice;
    }
}
