class Solution {
    public static boolean eve(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        if(count%2==0){
            return true;
        } else {
            return false;
        }
    }

    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length; i++){
            if(eve(nums[i])==true){
                c++;
            }
        }
        return c;
    }
}