class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            //System.out.println(s.charAt(i));
            if((s.charAt(i)>=97 && s.charAt(i)<=122)|| (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=48 && s.charAt(i)<=57)){
                str+=s.substring(i,i+1).toLowerCase();
            }
               
        }
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;   
    }
}