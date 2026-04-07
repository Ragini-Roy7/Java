package Collections.HashSet;
import java.util.HashMap;

public class HashSet_Using_HashMaps {
    class MyHashSet<E>{
        private static final Object PRESENT= new Object();
        private HashMap<E, Object>map= new HashMap<>();
        //implementing hashSet using HashMap
        public boolean add(E e ){
            return map.put(e,PRESENT)==null;
        }
        public boolean remove(E e){
            return map.remove(e)!=null;
        }
        public int size(){
            return map.size();
        }
        public void print_hash_set(){
            System.out.println(map.keySet());
        }

        public static void main(String[] args) {
            System.out.println("hash");
        }
    }
}



