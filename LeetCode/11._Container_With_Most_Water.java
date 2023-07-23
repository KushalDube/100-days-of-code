class Solution {
    public int maxArea(int[] height) {
        
        int i=0, j=height.length-1;
        int currWater=0, maxWater=0;

        while(i<j){
            int width=Math.abs(j-i);
            currWater=Math.min(height[i],height[j])*width;

            if(currWater>maxWater){ maxWater=currWater;}

            if(height[i]<height[j]){
                i++;
            } else {
                j--;
            }
        }

        return maxWater;
    }
}