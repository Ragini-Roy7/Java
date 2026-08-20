package greedy;
import java.util.*;
public class snackForStudents {
    public static int maxNoStudents(int[] students, int[] snacks){
        //give student snacks as per their hunger level
        Arrays.sort(students);
        Arrays.sort(snacks);
        int count=0;
        int i=0; //students ptr
        int j=0; //snacks pointer
        //snack>= students hunger level
        for(int k=0;i<students.length;k++){
            //perform while students and snacks are available
          while(i<students.length && j<snacks.length) {
             if(snacks[j]>= students[i]) {
                 count++;
                 i++;
                 j++;
             } else {
                 //try next snack
                 //current snack is too small to process
                 j++;
             }
          }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] students= {1,2,3,4};
        int[]snacks= {1,1,2,3,5};
        int res= snackForStudents.maxNoStudents(students,snacks);
        System.out.println(res);
    }
}
