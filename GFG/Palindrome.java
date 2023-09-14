class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int num=n,x=0;
        while(n!=0){
            int r=n%10;
            x=(x*10)+r;
            n=n/10;
        }
        if(x==num){
            return "Yes";
        } else {
            return "No";
        } 
    }
}
