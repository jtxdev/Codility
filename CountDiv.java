// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demoKGPAU6-8RC/

public class CountDiv {
    public int solution(int A, int B, int K) {
        int res = 0;
        if (A % K == 0) {
            res++;
        }
        res += B/K;
        res -= A/K;
        return res;
    }
    
}