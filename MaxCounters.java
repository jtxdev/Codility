// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demoSNZ3F8-4UP/

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int minimum = 0;
        int highest = 0;
        for (int i = 0; i < A.length; i++) {
            int X = A[i] - 1;
            if (X == N) {
                minimum = highest;
            } else {
                if (counters[X] < minimum) {
                    counters[X] = minimum;
                }
                counters[X]++;
                if (counters[X] > highest) {
                    highest = counters[X];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (counters[i] < minimum) {
                counters[i] = minimum;
            }
        }
        return counters;
    }
}