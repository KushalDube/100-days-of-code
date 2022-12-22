class Solution {
    public boolean isPalindrome(int x) {
        int num=x, pal=0, rem;

        while(x!=0){
            rem=x%10;
            pal=pal*10+rem;
            x=x/10;
        }

        if (num<0){
            return false;
        } else if (num==pal){
            return true;
        } else {
            return false;
        }
    }
}
