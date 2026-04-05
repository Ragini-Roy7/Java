package OOP;

public class My_Class {
    public static void main(String[] args) {
    Student std= new Student();
    std.calc_percentage(78,87,98);
        System.out.println(std.percentage);
    }
  static  class Student{
        String std_name;
        int roll_id;
        float percentage;
          void calc_percentage(int DSA, int Java, int System_Design){
             percentage= (DSA+Java+System_Design)/3.0f;
         }
    }
}
