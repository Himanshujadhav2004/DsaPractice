class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String str =strs[0];
        int n =str.length();
        for(int i=0;i<n;i++){
            char ch =str.charAt(i);
            for(int j=1;j<strs.length;j++){
            
            if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                return str.substring(0,i);
            }
            }
        }
return str;
    }
}