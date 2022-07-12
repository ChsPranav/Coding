class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int xpos=points[0][0];
        int ypos=points[0][1];
        int time=0;
        for(int i=1;i<points.length;i++){
            int curx=points[i][0];
            int cury=points[i][1];
            while(xpos!=curx || ypos!=cury){
                //System.out.println(xpos+"xpos was"+ypos);
                if(xpos<curx && ypos<cury){
                    xpos++;
                    ypos++;
                    time++;
                }
                else if(xpos>curx && ypos>cury){
                    xpos--;
                    ypos--;
                    time++;
                }
                else if(xpos>curx && ypos<cury){
                    xpos--;
                    ypos++;
                    time++;
                }
                else if(xpos<curx && ypos>cury){
                    xpos++;
                    ypos--;
                    time++;
                }
                else if(xpos<curx && ypos==cury){
                    xpos++;
                    time++;
                }
                else if(xpos>curx && ypos==cury){
                    xpos--;
                    time++;
                }
                else if(xpos==curx && ypos<cury){
                    //System.out.println("check");
                    ypos++;
                    time++;
                }else if(xpos==curx && ypos>cury){
                    ypos--;
                    time++;
                }
            }
            
        }
        return time;
    }
}