class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.length()==0) {return 0;}
        // if(s.length()==1) {return 1;}
        // if(s.length()==2) {
        //     if(s.charAt(0)==s.charAt(1)) {return 1;}
        //     else {return 2;}
        // }
        // int l=0, r=0;
        // int cnt=1, maxLen=1, len;

        // while(l<s.length() && r<s.length()) {
            
        //     if(s.charAt(l)!=s.charAt(r)) {
        //         cnt++;
        //     }

        //     if(s.charAt(l)==s.charAt(r)) {
        //         len=0;
        //         len = r-l;
        //         cnt=1;
        //         l++;
        //         r=l;
        //         maxLen = Math.max(maxLen,len);
        //     }
        //     r++;
        // }

        // HashSet<Character> set = new HashSet();
        // set.add(s.charAt(l));
        // while(l<s.length() && r<s.length()) {

        //     if(!set.contains(s.charAt(r))) {
        //         set.add(s.charAt(r));
        //     } else {
        //         len = set.size();
        //         maxLen = Math.max(len, maxLen);
        //         set.clear();
        //         l++;
        //         r=l;
        //     }
        //     r++;
        // }

        // return maxLen;

        Set<Character> ss = new HashSet<>();

        int i=0, ans=0;
        for(int j=0; j<s.length(); j++) {
            char c = s.charAt(j);
            while(ss.contains(c)) {
                ss.remove(s.charAt(i));
                i++;
            }
            ss.add(c);
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}