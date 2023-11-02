class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {return false;}
        // ArrayList<Integer> arr1=new ArrayList<Integer>();
        // ArrayList<Integer> arr2=new ArrayList<Integer>();

        // if(s.length() != t.length()){return false;}
        // for (int i=0; i<s.length(); i++){
        //     arr1.append()
        // }

        //try 2
        // String s1=s, t1=t;
        // for(int i=0; i<s.length(); i++) {
        //     if(s.charAt(i) == t.charAt(i)) {
        //         continue;
        //     }
        //     s=s.replace(s.charAt(i), t.charAt(i));
        // }
        // for(int i=0; i<s1.length(); i++) {
        //     if(s1.charAt(i) == t1.charAt(i)) {
        //         continue;
        //     }
        //     t1=t1.replace(t1.charAt(i), s1.charAt(i));
        // }
        // System.out.println(s);
        // System.out.println(t);
        // System.out.println(t1);
        // System.out.println(s1);
        // if(s.equals(t) && t1.equals(s1)) {
        //     return true;
        // } else {
        //     return false;
        // }

        //hashmap
        Map<Character, Character> cmap = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(!cmap.containsKey(s.charAt(i))) {
                if(!cmap.containsValue(t.charAt(i))) {
                    cmap.put(s.charAt(i), t.charAt(i));
                } else {
                    return false;
                }
            } else {
                if(cmap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}