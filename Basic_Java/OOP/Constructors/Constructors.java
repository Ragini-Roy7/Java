package OOP.Constructors;

public class Constructors {
    public static void main(String[] args){
        Post_Grad_Students s1= new Post_Grad_Students();
        s1.name= "Ram Shyam";
        s1.roll=81;
        s1.Has_Project= true;
        System.out.println("Name : "+s1.name +" "+  "Roll: " + s1.roll + " "+"Has Projects " +s1.Has_Project+ ":)");

        //another student
        Post_Grad_Students s2= new Post_Grad_Students();
        s2.name="Prakriti Kumari";
        s2.roll=78;
        s2.Has_Project=false;
        System.out.println("Name : "+s2.name + "Roll: "+"Has Projects "+ s2.Has_Project+ ":)");


    }
  static  class Post_Grad_Students{
        String name;
        int roll;
        boolean Has_Project;

        Post_Grad_Students(){

        }
    }
}
