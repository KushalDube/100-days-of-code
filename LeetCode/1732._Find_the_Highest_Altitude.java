class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> arr=new ArrayList<Integer>();

        int n=0;
        int g=0;
        for(int i=0; i<gain.length; i++){
            arr.add(n);
            n+=gain[i];
            if(n>g){
                g=n;
            }
        }
        return g;
    }
}