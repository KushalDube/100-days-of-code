class Solution {
    static String armstrongNumber(int n){
        // code here
        int r,ans=0,num=n;
        while(n!=0){
            r=n%10;
            ans=ans+(r*r*r);
            n=n/10;
        }
        if(ans==num){
            return "Yes";
        } else { 
            return "No";
        }
    }
}
