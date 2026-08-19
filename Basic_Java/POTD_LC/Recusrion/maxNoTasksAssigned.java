//package POTD_LC.Recusrion;
//import java.util.HashSet;
//public class maxNoTasksAssigned {
//    public  int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
//        //a worker can be assigned multiple times so we need to make sure it only gets assigned a single time
//        //we can check it by using HashSet
//        HashSet<Integer> assigned_already = new HashSet<>();
//        int count = 0;
//
//        for (int i = 0; i < tasks.length; i++) {
//            for (int j = 0; j < workers.length; j++) {
//                //worker already assigned
//                if (assigned_already.contains(j)) {
//                    //skip it
//                    continue;
//                }
//             if(Math.min(workers[j], tasks[i]) {
//                //check if worker can do the task currently
//                if (workers[j] >= tasks[i]) {
//                    //tasks alloted to worker
////                    workers[j]= tasks[i];
//                    assigned_already.add(j);
//                    count++;
//                    break;
//                }
//                //if not
//                //worker needs pill
//                else if (pills > 0 && workers[j] + strength >= tasks[i]) {
//                    pills--;
//                    //giving a pill , decrementing it if greater than 1
//
//                    //assign worker a task
////                    workers[j]=  strength+ tasks[i];
//                    assigned_already.add(j);
//                    count++;
//                    break;
//                }
//            }
//        }
//        return count;
//
//    }
//
//    public static void main(String[] args) {
//        int[] tasks = {1, 2, 4};
//        int[] workers = {0, 1, 2};
//        int pills = 1;
//        int strength = 5;
////        System.out.println(maxTaskAssigned(tasks, workers, pills, strength));
//        maxNoTasksAssigned obj = new maxNoTasksAssigned();
//        int res= obj.maxTaskAssign(tasks,workers, pills, strength);
//        System.out.println(res);
//    }
//
//
//
//
//}

package POTD_LC.Recusrion;

import java.util.HashSet;

public class maxNoTasksAssigned {

    public int maxTaskAssign(int[] tasks, int[] workers,
                             int pills, int strength) {

        HashSet<Integer> assigned_already = new HashSet<>();

        int count = 0;

        for (int i = 0; i < tasks.length; i++) {

            for (int j = 0; j < workers.length; j++) {

                if (assigned_already.contains(j)) {
                    continue;
                }

                if (workers[j] >= tasks[i]) {

                    assigned_already.add(j);
                    count++;
                    break;

                } else if (pills > 0 &&
                        workers[j] + strength >= tasks[i]) {

                    pills--;
                    assigned_already.add(j);
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] tasks = {1, 2, 4};
        int[] workers = {0, 1, 2};
        int pills = 1;
        int strength = 5;

        maxNoTasksAssigned obj = new maxNoTasksAssigned();

        int result = obj.maxTaskAssign(
                tasks, workers, pills, strength
        );

        System.out.println(result);
    }
}