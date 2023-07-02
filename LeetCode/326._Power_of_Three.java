class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(n==3 || n==1){
            return true;
        }
        // int val=0;
        // for(int i=0; i<n; i++){
        //     val=(int)Math.pow(3,i);
        //     // System.out.println(val);
        //     if(val==n){
        //         return true;
        //     }
        // }

        while(n!=1){
            int r=n%3;
            if(r!=0){return false;}
            n/=3;
        }

        return true;
    }
}