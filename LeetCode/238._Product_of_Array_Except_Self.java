class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lp[] = new int[nums.length];
        int rp[] = new int[nums.length];
        int ans[] = new int[nums.length];
        int pro=1;

        //creating a right product array
        for(int i=0; i<nums.length; i++) {
            pro = pro * nums[i];
            lp[i] = pro;
        }

        //creating a left product array
        pro=1;
        for(int i=nums.length-1; i>=0; i--) {
            pro = pro * nums[i];
            rp[i] = pro;
        }

        // assigning border cases and then loop for every index
        ans[0] = rp[1]; ans[ans.length-1] = lp[ans.length-2];
        for(int i=1; i<nums.length-1; i++) {
            ans[i] = lp[i-1] * rp[i+1];
        }

        return ans;
    }
}