class Solution {
    public int reverse(int x) {
        long ans=0;

        while(x!=0){
            int r=x%10;
            ans=(ans*10)+r;
            x=x/10;
            
            if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE){
                return 0;
            }
        }
        System.out.println(x);
        System.out.println(ans);
        return (int)ans;
    }
}