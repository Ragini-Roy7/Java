package greedy;
import java.util.*;

public class classroomScheduling {
    public static int maxNoClasses(int[]start_time, int[]end_time) {
        //choose earliest_finishing classes
        Arrays.sort(end_time);
        int no_of_class=1;

        ArrayList<Integer> res= new ArrayList<>();
        res.add(start_time[0]); //added into class
        int last_end= end_time[0];
        //choose earliest_finishing end_time
//        int early_end_time= end_time[0];
        for(int i=0;i<end_time.length;i++) {
//            res.add(end_time[0]);
//            no_of_class++;
//            if(end_time[i]> )

            if(start_time[i]>= last_end){
                no_of_class++;
                res.add(i);
                last_end= end_time[i];
            }
        }
        //actual condition if earlier chosen end_time > current end_time
        //don`t choose it, choose current
        return no_of_class;

    }

    public static void main(String[] args) {
        int[] start_time = {9,9,10,11,12};
        int[] end_time= {10,12,11,12,1};
        System.out.println(maxNoClasses(start_time,end_time));
    }
}
