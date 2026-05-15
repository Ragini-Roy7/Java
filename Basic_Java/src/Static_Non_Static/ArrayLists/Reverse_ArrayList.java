package src.Static_Non_Static.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_ArrayList {

    // Function to add user-given elements
    public static void addElements(ArrayList<Integer> list) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements you want to add? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        // call helper
        reverse_ele(list);
    }

    // Helper function to print in reverse
    private static void reverse_ele(ArrayList<Integer> list) {
        System.out.println("Reverse order:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        addElements(list);
//        reverse_ele(list);
        System.out.println("Final ArrayList: " + list);
        System.out.println("Reverse ArrayList:");
        reverse_ele(list);
    }
}