// Author: Jason Thai 11/06/2015
// https://codility.com/demo/results/demo8HVVFR-2CX/

public class MinPerimeterRectangle {
    public int solution(int N) {
        int min_perim = 0;
        int i;
        for (i = 1; i*i < N; i++) {
            if (N % i == 0) {
                min_perim = 2 * i + 2 * N / i;
            }
        }
        if (i * i == N) {
            min_perim = 4 * i;
        }
        return min_perim;
	}
}
