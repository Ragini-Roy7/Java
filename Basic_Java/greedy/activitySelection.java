package greedy;
import java.util.*;
public class activitySelection {
    public static  int selectActivity(int[]start, int[]end){
        int max_activities=1;
        int count=1;
        //initial activity chosen from start of act
//        creating list to add chosen activity into list
        ArrayList<Integer> res= new ArrayList<>();
        max_activities=1;
        res.add(0);
        //last activity which is ending first
        int activity_lastEnd= end[0];
        for(int i=1;i<end.length;i++) {
            if(start[i]>= activity_lastEnd) {
                //start time of activity should be greater or equal to last end of activity
                max_activities++;
                res.add(i);
                count++;
                activity_lastEnd= end[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start={1,3,0,5,8};
        int[]end= {2,4,6,7,9};
        int res= activitySelection.selectActivity(start,end);
        System.out.println(res);
    }
}
