package hashtable;

import java.util.ArrayList;

public class Hashtable{

//    HASH
static class Map<K,V>{

        private ArrayList<Node<K,V>> bucketArray;

        private int numBuckets;

        public Map(){
            bucketArray = new ArrayList<>();
            numBuckets = 10;

            for (int i = 0; i < numBuckets; i++){
                bucketArray.add(null);
            }
        }

        public int getBucketIndex(K key){
            int hashCode = key.hashCode();
            int index = hashCode % numBuckets;
            return index;
        }


//        GET KEY

        public V get(K key) {
            int index = getBucketIndex(key);
            Node<K, V> head = bucketArray.get(index);
            while (head != null) {
                if (head.key.equals(key)) {
                    return head.value;
                }
                head = head.next;
            }
            return null;
        }


//        REMOVING KEY

        public V remove (K key){

            int bucketIndex = getBucketIndex(key);

            Node<K,V> head = bucketArray.get(bucketIndex);
            Node<K,V> prev = null;

            while(head != null) {
                if (head.key.equals(key))
                    break;
                    prev = head;
                    head = head.next;
                }

                if(head == null)
                    return null;


                if(prev != null)
                    prev.next = head.next;

                else
                    bucketArray.set(bucketIndex, head.next);

            return head.value;
        }

//        ADD KEY VALUE PAIR TO HASH
        public void add(K key, V value){
            int bucketIndex = getBucketIndex(key);
            Node<K,V> head = bucketArray.get(bucketIndex);

            while (head!=null){
                if(head.key.equals(key)){
                    head.value=value;
                    return;
                }
                head=head.next;
            }


            head = bucketArray.get(bucketIndex);
            Node<K,V> newNode = new Node<K,V>(key, value);
            newNode.next=head;
            bucketArray.set(bucketIndex,newNode);
        }

//        CONTAINS KEY OR NOT
        public boolean contains(K key){

            int bucketIndex = getBucketIndex(key);
            Node<K,V> head = bucketArray.get(bucketIndex);

            while(head!=null) {
                if (head.key.equals(key))
                    return true;
                head = head.next;
            }
            return false;
        }

    }
}
