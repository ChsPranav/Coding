class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> neighbors=new ArrayList<ArrayList<Integer>>();
        if(source==destination)return true;
        for(int i=0;i<n;i++)neighbors.add(new ArrayList<Integer>());
        for(int i=0;i<edges.length;i++){
            neighbors.get(edges[i][0]).add(edges[i][1]);
            neighbors.get(edges[i][1]).add(edges[i][0]);
        }
        LinkedList<Integer> queue=new LinkedList<Integer>();
        queue.add(source);
        HashSet<Integer> set=new HashSet<Integer>();
        while(!queue.isEmpty()){
            for(int i=0;i<neighbors.get(queue.get(0)).size();i++){
                if(!set.contains(neighbors.get(queue.get(0)).get(i))){
                    if(neighbors.get(queue.get(0)).get(i)==destination)return true;
                    else queue.add(neighbors.get(queue.get(0)).get(i));
                    set.add(neighbors.get(queue.get(0)).get(i));
                }
            }
            queue.remove(0);
        }
        return false;
    }
}