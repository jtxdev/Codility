// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demo7RMNU2-WF2/

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int res = 0;
        if ((Y-X) % D != 0) {
            res += 1;
        }
        res += (Y-X)/D;
        return res;
    }
}