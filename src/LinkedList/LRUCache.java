package LinkedList;
import java.util.*;
class LRUCache {
    static class Node{
        int value,key;
        Node next;
        Node prev;
        Node(int k,int v){
            this.key=k;
            this.value=v;
        }
    }
     Node head=new Node(0,0);
     Node tail=new Node(0,0);
     int capacity;
    HashMap<Integer,Node> h= new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(h.containsKey(key)){
            Node node=h.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if (h.containsKey(key)) {
            remove(h.get(key));
        }
        if(h.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    public void insert(Node n){
        h.put(n.key,n);
        n.next=head.next;
        n.next.prev=n;
        head.next=n;
        n.prev=head;  
    }
    public void remove(Node n){
        h.remove(n.key);
        n.prev.next=n.next;
        n.next.prev=n.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// Input:
//  ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
//        [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]

// Output:
//  [null, null, null, 1, null, -1, null, -1, 3, 4]