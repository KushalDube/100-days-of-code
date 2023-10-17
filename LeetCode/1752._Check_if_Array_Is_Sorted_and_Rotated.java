class Solution {
    public boolean check(int[] nums) {
        // if(nums.length==1) {return true;}
        int count=0;
        int n=nums.length-1;
        
        for(int i=1; i<=n; i++) {
            if(nums[i]<nums[i-1]) {
                count++;
            }
        }

        if(nums[n] > nums[0]){
            count++;
        }

        System.out.print(count);
        return count <= 1;

    }
}