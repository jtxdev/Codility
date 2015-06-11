// https://codility.com/demo/results/demoYBVTTP-JXZ/

public class ChocolatesByNumbers {
	public int solution(int N, int M) {
       int lcm = N / gcd(N, M);
       return lcm;
    }
    
    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
