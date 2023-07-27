class Solution {

    public boolean good(String str) {
        char s[]=str.toCharArray();
        if(s[0]==s[1] || s[1]==s[2] || s[0]==s[2]){
            return true;
        }
        return false;
    }

    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0, j=3; j<=s.length(); i++, j++){
            System.out.println(s.substring(i,j));
            if(!good(s.substring(i,j))){
                count++;
            }
        }
        return count;
    }
}