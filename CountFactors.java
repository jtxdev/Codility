// Author: Jason Thai 11/06/2015
// https://codility.com/demo/results/demo9JTBYV-663/

import java.lang.Math;

public class CountFactors {
    public int solution(int N) {
        int factor = 0;
        int i;
        for (i = 1; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                factor += 2;
            }
        }
        
        if (i * i == N) {
            factor++;
        }
        return factor;
    }
}
