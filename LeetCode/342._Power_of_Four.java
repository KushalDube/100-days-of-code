class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) {
            return false;
        }
        if(n==1 || n==4) {
            return true;
        }
        while (n>1) {
            int r=n%4;
            if(r!=0) {
                return false;
            }
            n/=4;
        }
        return true;
    }
}