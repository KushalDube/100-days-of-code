class Solution {

    public int great(int n, int start, int arr[]) {
        for(int i=start; i<arr.length; i++){
            if(arr[i]>n){
                return arr[i];
            }
        }
        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]= new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    ans[i] = (great(nums1[i], j, nums2));
                }
            }
        }
        return ans;
    }
}