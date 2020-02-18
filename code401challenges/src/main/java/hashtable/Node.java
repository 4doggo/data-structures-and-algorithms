package hashtable;

public class Node <K, V> {

    K key;
    V value;

    Node<K,V> next;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    public Node(K key, V value){
        this.key=key;
        this.value=value;
    }

}
