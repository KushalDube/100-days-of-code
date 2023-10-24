class Solution {
    public int longestConsecutive(int[] nums) {

        //Better Approach
        if(nums.length == 0) {return 0;}
        Arrays.sort(nums);
        int lon=1, ls=Integer.MIN_VALUE, cnt=0; //ls - lastSmaller

        for( int i=0; i<nums.length; i++) { 
            // if(nums[i] != ls) { ls=nums[i]; i++; cnt++}
            System.out.print(nums[i]+" ");
            if(nums[i]-1 == ls) {
                cnt++;
                ls=nums[i];
                // if(ls<cnt) {ls=cnt;}
            }
            else if (nums[i]!=ls) {
                cnt=1;
                ls=nums[i];
            }
            lon=Math.max(lon,cnt);
        }
        return lon;
    }
}