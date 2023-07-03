class Solution {

    public int findDuplicate(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]==nums[j]){
        //             return nums[j];
        //         }
        //     }
        // }

        // for(int i=0, j=nums.length-1; i<nums.length; ){
        //     if(nums[i]!=nums[j]){
        //         j--;
        //     }
        //     if(j==i+1){
        //         i=j;
        //         j=nums.length-1;
        //     }
        //     if(nums[i]==nums[j]) {
        //         return nums[i];
        //     }
        // }

        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}