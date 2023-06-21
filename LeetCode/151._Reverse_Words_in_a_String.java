class Solution {
    public String reverseWords(String s) {
        String ans= new String();
        int i=s.length()-1;
        int j=s.length();
        while(i>=0){
            if(s.charAt(i)==' '){
                ans=ans+s.substring(i,j);
                j=i;
            }
            i--;
        }
        ans=ans+" "+s.substring(0,j);

        return ans.replaceAll("\\s+"," ").trim();
    }
}