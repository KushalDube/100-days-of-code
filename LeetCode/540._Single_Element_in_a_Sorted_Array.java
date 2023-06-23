class Solution {
    public int singleNonDuplicate(int[] nums) {
        int count=0;
        if(nums.length==1){return nums[0];}
        for (int i=1; i<=nums.length; i+=2){
            if(i==nums.length){return nums[i-1];}
            System.out.println(nums[i]+" "+nums[i-1]);
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }
        return -1;
    }
}