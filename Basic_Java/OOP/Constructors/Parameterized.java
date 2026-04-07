package Constructors;

public class Parameterized {
    String name;
    int id;
    int exp;

    Parameterized(String name, int id, int exp){
        this.name=name;
        this.id=id;
        this.exp=exp;
    }
    void display_info(){
        System.out.println("Name : "+name+ " has id : "+id);
    }
    public static void main(String[] args){
        Parameterized p1= new Parameterized("Ragini",20368,5);
        p1.display_info();
    }
}
