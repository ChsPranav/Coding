class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer>data =new ArrayList<>();
        for(int i=triangle.size()-1;i>=0;i--){
            if(i==triangle.size()-1){
                int value=i;
                for(int j=0;j<triangle.get(i).size();j++){
                    data.add(triangle.get(i).get(j));
                }
            }
            else{
                for(int j=0;j<triangle.get(i).size();j++){
                    int temp=Math.min(data.get(j),data.get(j+1));
                    //System.out.println(j+"and values was"+triangle.get(i).get(j)+"also"+temp);
                    data.set(j,triangle.get(i).get(j)+temp);
                }
            }
        }
        //System.out.println(ans);
        return  data.get(0);
    }
}