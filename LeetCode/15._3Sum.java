//todo

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // List<List<Integer>> arr=new ArrayList<>();
        // ArrayList<Integer> x=new ArrayList<Integer>();
        // for(int i=0;i<nums.length; i++){
        //     for(int j=0; j<nums.length; j++){
        //         for(int k=0; j<nums.length; k++){
        //             if(i!=j && i!=k && j!=k && nums[i]+nums[j]+nums[k]==0){
        //                 x.add(i);
        //                 x.add(j);
        //                 x.add(k);
        //                 arr.add(x);
        //             }
        //             x.clear();
        //         }
        //     }
        // }

        // List<List<Integer>> ans = new ArrayList<>(arr);
        // return ans;

        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1; j<nums.length; j++) {
                int third = -(nums[i] + nums[j]);
                if(hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}