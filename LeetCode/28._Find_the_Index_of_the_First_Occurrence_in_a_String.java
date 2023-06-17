class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i=0,j=needle.length(); i<(haystack.length()-needle.length()); i++,j++){
            System.out.println(haystack.substring(i,j));
            if(haystack.length()==1 && haystack.charAt(0)==needle.charAt(0)){
                return 0;
            }
            if(haystack.substring(i,j).compareTo(needle)==0){
                return i;
            }
        }
        return -1;
    }
}