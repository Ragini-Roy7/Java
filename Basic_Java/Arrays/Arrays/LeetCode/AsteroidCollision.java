package Arrays.LeetCode;
import java.util.Arrays;
import java.util.*;
public class AsteroidCollision {
    public static int[] asteroid_collision(int[] asteroids){
        //compute diff only when asteroid[i] and asteroid[n-1] are going in opp dir
        //two asteroids meet ->smaller will explode
        //if both asteroids same->both will explode
        //two asteroids moving in same dir will never meet
        //current_state maintain
        //we need to compare absolute value of each asteroid with its next one
        //accordingly update state behaviour
        //condition 1: two asteroids only will meet if given val is <0
//        int state_collision;
//        int diff=0;
//        for(int i=0;i<asteroid.length;i++){
//            state_collision=asteroid[i];
//            System.out.println("initial state collision : "+state_collision);
//            //compare with its absolute val
//            if(Math.abs(asteroid[i]) > asteroid[i+1]) {
//                //update state collision
//                //we need to store the diff of each collision state using its absolute values
//                state_collision=Math.abs( asteroid[i+1])- Math.abs(asteroid[i]);
//                System.out.println("current state collision: "+state_collision);
//            }
//            //condition 2:  when asteroids will meet
//            if(asteroid[i]>0 && asteroid[i+1]<0) {
//                //compare asteroid values
//                //if asteroid ith ele is negative , find its absolute compare with its next ele
//               diff= Math.abs(asteroid[i]-asteroid[i+1]);
//            }
//            if(asteroid[i]<0 && asteroid[i+1]>0) {
//                //compare asteroid values if next ele is negative
//                 diff= Math.abs(asteroid[i+1]-asteroid[i-1]);
//            }
//            //condition 3: if same size of asteroids
//
//
//            //condition if asteroid ele and its next ele is greater than 0 , will never meet
//
//        }
//
//    }
        int n=asteroids.length;
        int[] res= new int[n];
        //creating stack like ptr
        int size=0;
        for(int a: asteroids ){
            //condition collision
            while(size > 0 && res[size-1] > 0 && a<0) {
                if(Math.abs(res[size-1])< Math.abs(a)) {
                    //destroying previous asteroids
                    //since we are removing the stack like ptr from memory
                    size--;
                    //if it gets destroyed, don`t store into result[] skip that from storing
                    continue;
                }else if(Math.abs (res[size- 1])==Math.abs(a)) {
                    //condition 2: if both are haivng same masses , both will be destroyed
                    size--;
                }
                //curr asteroid destroyed
                a=0;
                break;
            }
            if(a!=0) {
                //move the stack like ptr ahead and store where enumeration happening
                res[size++]=a;
            }
        }
        return Arrays.copyOf(res,size);
    }

    public static void main(String[] args) {
        int[] asteroids= {3,5,-6,2,-1,4};
       int[] res=  asteroid_collision(asteroids);
        System.out.println(Arrays.toString(res));
//

    }

}
