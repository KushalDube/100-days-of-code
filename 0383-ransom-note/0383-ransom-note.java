class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // if(ransomNote.equals(magazine)){
        //     return true;
        // }
        
        // for( int i=0; i<ransomNote.length(); i++){
        //     for( int j=0; j<magazine.length(); j++){
        //         if(magazine.charAt(j)==ransomNote.charAt(i)){
        //             break;
        //         } else {
        //             return false;
        //         }
        //     }
        // }
        // return true;

        // for(int i=0; i<ransomNote.length(); i++){
        //     if(magazine.contains(ransomNote.charAt(i))){
        //         continue;
        //     } else {
        //         return false;
        //     }
        // }
        // return magazine.contains(ransomNote);

        for(int i=0; i<ransomNote.length(); i++) {
            if(!magazine.contains(String.valueOf(ransomNote.charAt(i)))) {
                return false;
            }
            String strnew = magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)), "");
            magazine = strnew;
        }
        return true;
    }
}