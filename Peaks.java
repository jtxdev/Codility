// https://codility.com/demo/results/demoNDT9J5-C4N/
// adapted http://rafal.io/posts/codility-peaks.html 
// Overthought problem apparently, bruteforce works after aggregate

import java.util.ArrayList;

public class Peaks {
    public int solution(int[] A) {
        int N = A.length;
        ArrayList<Integer> peaks = new ArrayList<Integer>();

        for (int i = 1; i < N - 1; i++) {
            if (A[i-1] < A[i] && A[i] > A[i+1]) {
                peaks.add(i);
            }
        }
        
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                int sz = N/i;
                int target = 0;
                for (int peak : peaks) {
                    if (peak/i > target) {
                        break;
                    } 
                    if (peak/i == target) {
                        target++;
                    }
                }
                if (target == sz) {
                    return sz;
                }
            }
        }
        return 0;
    }
}