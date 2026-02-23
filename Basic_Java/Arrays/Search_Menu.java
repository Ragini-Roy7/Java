package Arrays;

public class Search_Menu {

    public static boolean search_menu(String[] name, String key) {

        for (int i = 0; i < name.length; i++) {

            if (name[i].equals(key)) {
                System.out.println("Element " + name[i] + " is found at index " + i);
                return true;
            }
        }

        System.out.println("Not Found");
        return false;
    }

    public static void main(String[] args) {

        String[] name = {"Dosa", "Chhole Bhature", "Coca Cola", "Pav Bhaji", "Samosa"};
        String key = "Coca Cola";

        search_menu(name, key);
    }
}