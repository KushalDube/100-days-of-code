class Solution {
    public int tribonacci(int n) {
        if(n==1){ return 1;}
        if(n==2){ return 1;}
        if(n==3){ return 2;}
        int a=0, b=1, c=1, sum=0;
        
        for(int i=2; i<n; i++){
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
        }

        return sum;
    }
}