// Author: Jason Thai 11/06/2015
// https://codility.com/demo/results/demo77XSVR-WCN/

import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        Arrays.sort(A);
        int res = 0;
        int last = 100000000;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != last) {
                res++;
            }
            last = A[i];
        }
        return res;
    }
}
