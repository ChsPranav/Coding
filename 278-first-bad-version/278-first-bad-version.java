/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int num=0;
        int start=0;
        int end=n;
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start+(end-start)/2;
            boolean check=isBadVersion(mid);
            //System.out.println(check+"and "+mid+"start"+start+"end"+end);
            if(check==true){
                num=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return num;
    }
}