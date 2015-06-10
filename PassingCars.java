// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demoVPQ435-AE8/

public class PassingCars {
    public int solution(int[] A) {     
        int passes = 0;
        int numeast = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                numeast++;
            }
            if (A[i] == 1) {
                passes += numeast;
            }
            if (passes > 1000000000) {
                return -1;
            }
        }
        return passes; 
    }
}