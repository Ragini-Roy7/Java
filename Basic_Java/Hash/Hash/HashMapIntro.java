//package Hash;
//import java.util.*;
//public class HashMapIntro {
//    public static void main(String[] args) {
//
//     //unordered key value pairs with distinct keys
//        //fast lookup - insert,search,remove - 0(1)
//        HashMap<String, Integer> hm = new HashMap<>();
//
//        //inserting key value pairs
//        hm.put("india", 150);
//        hm.put("china", 110);
//        hm.put("brazil", 100);
//        System.out.println(hm);
//
//        //accessing a val
//        System.out.println("india`s population: "+hm.get("india"));
//
//        //update a val
//        System.out.println("china`s population declined :"+hm.put("china",100));
//
//        //remove key
//        hm.remove("brazil");
//
//        //for each iterate
//        for(Map.Entry <String, Integer> entry : hm.entrySet()) {
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//        }
//
//        //contains->true or false returned
//        System.out.println(hm.containsKey("Pakistan"));
//        System.out.println(hm.size());
//        System.out.println(hm.isEmpty());
//        //iterate
//        Set<String> keys= hm.keySet();
//        System.out.println(keys);
//
//    }
//
//
//}