package src.Static_Non_Static.Recursion;

public class Friends_Pairing {
    //n friends can remain single or can be paired up with some other friend
    //each can be paired only once
    //tot way to pair either to remain single or paired up
    static int total_ways(int n){
        if(n==1 || n==2){
            return n;
            //only one person
            //no pair-> only one choice to remain single so tot_ways=1
            //thus base case
        }
//        int total_ways= total_ways(n-1)+(n-1)*(n-2);
//        System.out.println(total_ways);
//        return total_ways;
        //choice to remain single , if one person has decided to remain single
        //means now we have to calc for n-1 friends so recurrence relation ->(n-1)
        int choice_for_single= total_ways(n-1);

        //if one pair is made then now we have to calculate for remaining friends
        //that is n-2 friends
        //no of ways for pairing up with n-2 ->n-1
        int choice_for_pairing= total_ways(n-2);
        int pairWays= (n-1)*choice_for_pairing;
        int total_ways= choice_for_single+ pairWays;
        return total_ways;


    }

    public static void main(String[] args) {
        int n=3;
//        total_ways(n);
        System.out.println(total_ways(n));
    }
}
