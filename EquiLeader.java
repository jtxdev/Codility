// https://codility.com/c/intro/demoVEJUT3-SJD


public class EquiLeader {
	public int solution(int[] A) {
		
        int len = A.length;      		
        int st, top, target;
        
        int leftleader[] = new int[len]; 
        st = 0;
        top = 0;
        for (int i = 0; i < len; i++) {
            if (st == 0) {
                st++;
                top = A[i];
            } else {
                if (top != A[i]) {
                    st--;
                } else {
                    st++;
                }
            }
            if (st > 0) {
            	leftleader[i] = top;
            } else {
            	leftleader[i] = 1000000001;
            }
        }
        
        if (st > 0) {
            int count = 0;
            for (int i = 0; i < len; i++) {
                if (A[i] == top) {
                    count++;
                }
            }
            if (count <= len/2.0) {
                return 0;
            }
        } else {
        	return 0;
        }
        target = top;
        
        int rightleader[] = new int[len];
        st = 0;
        top = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (st == 0) {
                st++;
                top = A[i];
            } else {
                if (top != A[i]) {
                    st--;
                } else {
                    st++;
                }
            }
            if (st > 0) {
            	rightleader[i] = top;
            } else {
            	rightleader[i] = 1000000001;
            }
        }
        
        int eqldrs = 0;
        for (int i = 0; i < len - 1; i++) {
        	if (leftleader[i] == rightleader[i+1] && leftleader[i] == target) {
        		eqldrs++;
        	}
        }
        return eqldrs;
    }
}
