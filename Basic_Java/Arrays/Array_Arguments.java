package Arrays;

import java.sql.SQLOutput;

public class Array_Arguments {
    public static void update_marks(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            //updating by +5
            marks[i] = marks[5];
            System.out.println(marks);
            //prints memory reference
            System.out.println(marks[i]);
        }
        //calling function inside main
    }

    public static void main(String[] args) {
        int[] marks = {78, 97, 87, 89, 97, 89};
        update_marks(marks);
        System.out.println(marks.getClass());
        //arrays are objects in java
        //it does not store 6 elements
        //instead points to reference in the heap memory
        //allocates space for 6 integers
        //marks store address of that object
        //output-> class [I
        //[ means array I mean integer
        //printing
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }


}
