class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+",");
        // }

        if(arr.length%2!=0){
            return arr[arr.length/2];
        } else {
            System.out.println(arr[(arr.length/2)]);
            System.out.println(arr[(arr.length/2)]-1);
            return (double)(arr[(arr.length/2)]+arr[(arr.length/2)-1])/2;
        }
    }
}