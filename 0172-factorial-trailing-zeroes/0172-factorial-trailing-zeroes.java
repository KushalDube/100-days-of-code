class Solution {

    // public long facto(int n){
    //     if(n==0) return 1;
    //     int ans=1;
    //     for(int i=1; i<=n; i++) {
    //         ans=ans*i;
    //     }
    //     return ans;
    // }

    public int trailingZeroes(int n) {
        // long fact=facto(n);
        // int count=0;
        // System.out.println(fact);
        // double r=0;
        // while(r==0){
        //     r=fact%10;
        //     System.out.print(r+" ");
        //     if(r==0){count++;}
        //     fact=fact/10;
        // }

        // return count;

        // int count=0, i=1,ans=0;
        // double ca=n;
        
        // while(true) {
        //     ca=(int) 5/(Math.pow(5,i));
        //     if(ca<=0) break;
        //     ans += ca;
        //     ca=0;
        // }

        // return count;

        int count=0;
        while(n>0) {
            count += n/5;
            n/=5;
        }
        return count;

    }
}