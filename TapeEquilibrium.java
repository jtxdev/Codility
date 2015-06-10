// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demoKGK2FA-Z8C/

public class TapeEquilibrium {
    public int solution(int[] A) {
        int[] cumulative = new int[100010];
        cumulative[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			cumulative[i] = cumulative[i-1] + A[i];
//			System.out.println(cumulative[i]);
		}        
	    int best = cumulative[0] - (cumulative[A.length-1] - cumulative[0]);
	    if (best < 0) {
	        best *= -1;
	    }
    	for (int i = 1; i < A.length; i++) {
    	    int bottom = cumulative[i-1];
    	    int top = cumulative[A.length - 1] - bottom;
//    	    System.out.println(bottom);
//    	    System.out.println(top);
    	    int test = bottom - top;
    	    if (test < 0) {
    	        test *= -1;
    	    }
    	    if (test < best) {
    	    	best = test;
    	    }
    	}
        return best;
    }
}