class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int m = (int) (n/3)+1;

        for(int i=0; i<n; i++) {
            int value = hm.getOrDefault(nums[i], 0);
            hm.put(nums[i], value+1);

            if(hm.get(nums[i])==m) {
                arr.add(nums[i]);
            }
            if(arr.size()==2){break;}
        }

        return arr;

    }
}