class Solution {
    public String reverseWords(String s) {
     String[] str=s.split(" ");
     for(int i=0;i<str.length;i++){
         //String temp=str[i];
         char ch[]=str[i].toCharArray();  
        String rev="";  
        for(int j=ch.length-1;j>=0;j--){  
            rev+=ch[j];  
        }  
         str[i]=rev;
     }
    String ans="";
      for(int i=0;i<str.length;i++)ans+=str[i]+" ";
        return ans.substring(0,ans.length()-1);
    }
}