package OOP;
import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
    //we use collections to store multiple values efficiently equivalent to using struct in c
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
      //enter no of students you want to calc marks of
        System.out.println("No of students for calc percentage");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("\nEnter details of student "+(i+1));

            System.out.println("Student Name: ");
            String std_name= sc.nextLine();

            System.out.println("Roll ID:  ");
            int roll_id= sc.nextInt();

            System.out.println(" Enter Marks in DSA Scored: ");
            int dsa= sc.nextInt();

            System.out.println("Enter Marks in Java Scored: ");
            int java= sc.nextInt();

            System.out.println("Enter Marks in ML Scored: ");
            int ml=sc.nextInt();
            sc.nextLine();

            students.add(new Student(std_name, roll_id, dsa,java,ml));


        }
        System.out.println("\n---Students Report is getting generated---");
        for(Student s: students){
            System.out.println(s.std_name+ "| Roll ID: "+ s.roll_id+
                    "|Percentage: "+s.percentage_scored);
        }

    }
    static class Student{
        String std_name;
        int roll_id;
        int dsa;
        int java;
        int ml;
        float percentage_scored;

        Student(String std_name, int roll_id, int dsa, int java, int ml){
            this.std_name= std_name;
            this.roll_id= roll_id;
            this.dsa= dsa;
            this.java=java;
            this.ml=ml;
            this.percentage_scored=(dsa+java+ml)/3.0f;



        }
    }
}
