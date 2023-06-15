class Solution {
    public int minimizedStringLength(String s) {
        int count=0;
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }
        return count+1;
    }
}