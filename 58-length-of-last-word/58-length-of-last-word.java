class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(i==s.length()-1){
                while(s.charAt(i)==' '){
                    i--;  
                }
            }
            
            if(s.charAt(i)!=' ')ans++;
                else{
                     return ans;
                }
        }
        return ans;
    }
}