class Solution {
    public String simplifyPath(String path) {
Stack<String>data=new Stack<>();
        StringBuilder res=new StringBuilder();
        String[] p=path.split("/");
        for(int i=0;i<p.length;i++){
            if(!data.isEmpty() && p[i].equals("..")) data.pop();
            else if(!p[i].equals(".") && !p[i].equals("") && !p[i].equals("..") )data.push(p[i]);
        }
        if(data.isEmpty())return "/";
        while(!data.isEmpty()){
            res.insert(0,data.pop()).insert(0,"/");
        }
        return res.toString();
    }
}