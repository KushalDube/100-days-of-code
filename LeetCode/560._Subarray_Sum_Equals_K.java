class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==1) {if(k==1){return 1;}else{return 0;}}
        int sum=0, count=0;
        for(int i=0; i<nums.length; i++) {
            sum=0;
            for (int j=i; j<nums.length; j++) {
                // for(int x=i; x<=j; x++) {
                //     sum+=nums[x];
                // }
                sum+=nums[j];
                if(sum==k){count++;}
            }
        }
        return count;
    }
}