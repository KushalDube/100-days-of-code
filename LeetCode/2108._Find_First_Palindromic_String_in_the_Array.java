class Solution {
    public boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        String rev=sb.reverse().toString();
        if(str.equals(rev)){
            return true;
        } else {
            return false;
        }
    }

    public String firstPalindrome(String[] words) {
        String out="";
        for(int i=0; i<words.length; i++){
            if(isPalindrome(words[i])){
                out=words[i];
                break;
            }
        }
        return out;
    }
}