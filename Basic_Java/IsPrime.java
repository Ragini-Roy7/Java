public class IsPrime {
    // public static boolean isPrime(int n){
    //    boolean  isPrime=true;
    //    for(int i=2;i<n-1;i++) {
    //     if(n %2 ==0){
    //         isPrime=false;
    //         System.out.println(isPrime);
    //         break;
    //     }
    //    }
    //    System.out.println(isPrime);
    //    return isPrime;
    //optimizing loop
    public static boolean IsPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(n);i++){
            //calc root under n*n to reduce its looping 
            //tc optimized 
            //repeated factors calc avoided 
            //8= 1*8, 2*4, 4*2
            if(n % i==0){
                return false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args){
        System.out.println(IsPrime(5));
    }
}