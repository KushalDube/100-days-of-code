class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        // for(int i=0; i<nums.length; i++){
        //     System.out.print(nums[i]+" " );
        // }
        int i=0;
        for(i=2; i<nums.length; i+=3){
            if(nums[i]!=nums[i-2]){
                return nums[i-2];
            }
        }
        if(i>=nums.length){
            return nums[nums.length-1];
        }

        return 0;
    }
}