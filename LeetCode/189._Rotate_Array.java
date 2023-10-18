class Solution {
    public void rotate(int[] nums, int k) {
        // if(nums.length==1 || k==0){return;}
        // int arr[]=new int[nums.length];

        // for(int i=Math.abs(nums.length-k), j=0; j<nums.length; j++){
        //     System.out.print(nums[i]+", ");
        //     arr[j]=nums[i];
        //     i=(i+1)%nums.length;
        // }
        // System.arraycopy(arr, 0, nums, 0, nums.length);

        // logic 
        // place of array: arr[(i+k)%n] = nums[i]; anything divided by the length will return thr remainder within the range of 0 to n-1.

        int arr[]=new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            arr[(i+k)%nums.length] = nums[i];
        }
        System.arraycopy(arr, 0, nums, 0, nums.length);

    }
}