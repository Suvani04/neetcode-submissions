class Solution {
    public String longestCommonPrefix(String[] strs) {
       // int strs= str.length();
       String prefix = strs[0]; 
       for(int j=0; j<prefix.length();j++){
        for(int i=0; i<strs.length; i++){
            if(j>= strs[i].length()){
                return prefix.substring(0,j);
            }
            if(strs[i].charAt(j)!= strs[0].charAt(j)){
                return prefix.substring(0,j);
            }
        }
       }
       return prefix;
    
    }
}