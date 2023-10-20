class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int i=0, j=1;
        int arr[] = new int[nums.length];

        for(int x=0; x<nums.length; x++){
            if(nums[x]>0){
                arr[i] = nums[x];
                i+=2;
            }
            if(nums[x]<0){
                arr[j] = nums[x];
                j+=2;
            }
        }
        return arr;
    }
}