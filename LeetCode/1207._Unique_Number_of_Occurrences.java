class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    Arrays.sort(arr);
        ArrayList<Integer> counts=new ArrayList<Integer>();
        int count=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                counts.add(count+1);
                if(i==arr.length-1){
                    counts.add(1);
                }
                count=0;
            } else {
                count++;
            }
        }
        // for (int j=0; j<counts.size();j++){
        //     System.out.print(counts.get(j)+", ");
        // }

        Collections.sort(counts);
        for(int j=1; j<counts.size(); j++){
            if(counts.get(j)==counts.get(j-1)){
                return false;
            }
        }

        return true;
    }
}