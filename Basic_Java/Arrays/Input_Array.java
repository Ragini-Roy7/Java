package Arrays;

import java.util.Scanner;

public class Input_Array {
    //create a scanner class
    public static void main(String[] args) {
        int[] marks = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks for 6 subjects:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Operating System: " + marks[0]);
        System.out.println("Data Structures:" + marks[1]);
        System.out.println("Machine Learning using Python:" + marks[2]);
        System.out.println("Network and Data Communication:" + marks[3]);
        System.out.println("Java:" + marks[4]);
        System.out.println("LLM:" + marks[5]);
        System.out.println("Data Science with R:" + marks[6]);

        int total_marks = 0;
        for (int i = 0; i < marks.length; i++) {
            total_marks += marks[i];
        }
        System.out.println("Total Marks: " + total_marks);
        double average = total_marks / 6.0;
        System.out.println("Average is:" + average);
        double percentage = (total_marks / 600.0) * 100;
        System.out.println("Percentage Score:" + percentage);
        //find highest and lowest
        int max_marks = marks[0];
        int min_marks = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (max_marks < marks[i]) {
                max_marks = marks[i];
            }
            if (min_marks > marks[i]) {

                min_marks = marks[i];
            }
        }
        System.out.println("Maximum Marks : " + max_marks);
        System.out.println("Minimum Marks:" + min_marks);
        //length of arr
        System.out.println("Length of Marks Array:" + marks.length);


    }
}
