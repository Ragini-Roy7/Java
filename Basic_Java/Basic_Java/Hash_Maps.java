package Basic_Java;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Maps {
    public static void main(String[] args) {
        //maps are unordered data structure like hashsets
        HashMap<String,Integer> map = new HashMap<>();
        map.put("China",156);
        map.put("India",170);
        map.put("Australia",23);
        System.out.println(map);
        //can update values
        map.put("India",200);
        System.out.println(map);
        if(map.containsKey("China")) {
            System.out.println("key exist");
        }else {
            System.out.println("does not exist");
        }
        //get, containsKey are called lookup function
        //search -> get()
        System.out.println(map.get("India"));
        System.out.println(map.get("Beijing"));
        //for(int va:arr)
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //using keyset
        Set<String> keys= map.keySet();
        for(String k: keys) {
            System.out.println(keys + " "+map.get(keys));
        }
    }
}
