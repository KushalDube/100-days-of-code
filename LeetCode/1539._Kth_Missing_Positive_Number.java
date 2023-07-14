class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> narr=new ArrayList();
        int count=0; 
        for(int i=1, j=0; i>0; i++){
            if(j<arr.length){
                if(i==arr[j]){
                    j++;
                    continue;
                }
            }
            narr.add(i);
            count++;
            if(count==k){
                return i;
            }
        }
        return -1;
    }
}