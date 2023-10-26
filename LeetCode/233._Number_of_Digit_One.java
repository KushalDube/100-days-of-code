class Solution {
    public int countDigitOne(int n) {
        int count = 0, factor = 1, k = n;
        while(n>0){
            int m = n/10, rem = n%10, amount;
            
            if(rem == 0) amount = 0;
            else if(rem > 1) amount = factor;
            else amount = k%factor+1;
    
            count += m*factor + amount;
            factor *= 10;
            n = n/10;
        }
        return count;
    }
}