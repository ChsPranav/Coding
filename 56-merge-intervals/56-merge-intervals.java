class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<Integer>starttime=new ArrayList<>();
        ArrayList<Integer>endtime=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(i==0){
                starttime.add(intervals[0][0]);
                endtime.add(intervals[0][1]);
            }
            else{
                if(intervals[i][0]<=endtime.get(endtime.size()-1) || intervals[i][0]<starttime.get(starttime.size()-1))
                {
                    if(intervals[i][0]!=intervals[i][1] || intervals[i][0]>=starttime.get(starttime.size()-1)){
                         if(intervals[i][0]<starttime.get(starttime.size()-1)){
                        starttime.set(starttime.size()-1,Math.min(intervals[i][0],starttime.get(starttime.size()-1)));
                    }
                    endtime.set(endtime.size()-1,Math.max(intervals[i][1],endtime.get(endtime.size()-1)));
                    }
                    else{
                         starttime.add(intervals[i][0]);
                    endtime.add(intervals[i][1]);
                    }
                   
                }
                else {
                    starttime.add(intervals[i][0]);
                    endtime.add(intervals[i][1]);
                }
            }
        }
        int[][] a=new int[starttime.size()][2];
        for(int i=0;i<starttime.size();i++){
            a[i][0]=starttime.get(i);
            a[i][1]=endtime.get(i);
        }
        return a;
    }
}