package src.Static_Non_Static.Threads;

public class Intro_Thread {
    public Intro_Thread(My_Thread t1) {
        System.out.println("is it my thread");

    }

    static class My_Thread implements Runnable{
        public void run(){
            String str="My thread";
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        My_Thread t1= new My_Thread();
        //initialize thread obj
        Intro_Thread g1= new Intro_Thread(t1);
        g1.start();
    }

    private void start() {
        System.out.println("thread starting");
    }
}
