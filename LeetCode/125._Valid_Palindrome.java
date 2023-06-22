class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder("");
        if(s.equals(" ")){ return true; }
        for(int i=0; i<s.length(); i++){
            char a=s.charAt(i);
            if ((a>='a' && a<='z') || (a>='A' && a<='Z') || (a>='0' && a<='9')){
                sb.append(s.charAt(i));
            }
        }
        // s.toLowerCase();
        // System.out.println(s.toLowerCase());
        String a=sb.toString().toLowerCase();
        // System.out.println(a);
        String b=sb.reverse().toString().toLowerCase();
        // System.out.println(b);
        return a.equals(b);
        // String str=s.replaceAll("")        

    }
}