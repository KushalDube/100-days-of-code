class Solution {
    public String removeOuterParentheses(String s) {
        // String out="";
        // int cnt=0; 

        // for(int i=0; i<s.length(); i++) {
        //     if(s.charAt(i)=='('){
        //         cnt++;
        //     } else if(s.charAt(i)==')') {
        //         cnt--;
        //     }
        //     if(cnt==1) {
        //         out+="()";
        //     }
        // }

        // return out;

        Stack<Character> st = new Stack<>();
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '('){
                if(st.size()>0){
                    sb.append(ch);
                }
                st.push(ch);
            } else {
                st.pop();
                if(st.size()>0) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}