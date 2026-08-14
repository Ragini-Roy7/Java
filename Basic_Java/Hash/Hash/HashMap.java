package Hash;

import java.util.LinkedList;

public class HashMap {
    public class HashMapImplementation<K,V> {
        private class Node {
            K key;
            V value;
            public Node(K key, V value){
                this.key= key;
                this.value=value;
            }
        }
        private int size; //no of nodes or pairs
        private LinkedList<Node> buckets[];// N buckets ie. array
@SuppressWarnings("Unchecked")
 public void HashMap(){
     this.size=0;
     this.buckets= new LinkedList[4];

     for(int i=0;i<4;i++){
         this.buckets[i]= new LinkedList<>();
     }
 }
 private int hashFunction(K key) {
     int hashCode= key.hashCode();
    return Math.abs(hashCode) % size;
 }
 private int SearchInLL(K key, int bucket_index) {
    LinkedList<Node> ll = buckets[bucket_index];
    int data_index=0;
    for(int i=0;i<ll.size();i++) {
        Node node=ll.get(i);
        if(node.key==key){
          return data_index;
        }
        data_index++;
    }
    return -1;
 }
 public void put(K key, V value){
    int bucket_index = hashFunction( key);
    int data_index = SearchInLL(key, bucket_index);

 }

    }
}
