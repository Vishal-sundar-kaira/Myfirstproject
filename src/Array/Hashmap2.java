package Array;

import java.util.*;

//here we learned how to implement hash map.
public class Hashmap2 {
    static class HashMapp<k,v>{//if we dont know about datatype we assign generic values.
        // creating linked list node structure.
        private class Node{
            k key;
            v value;
            public Node(k key,v value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;//n-nodes
        private int N;//N-buckets
        private LinkedList<Node> buckets[];//bucket array which has type linkedlist of node
        @SuppressWarnings("unchecked")
        public HashMapp(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++)
            {
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(k key)
        {
           int bi=key.hashCode();
           return Math.abs(bi)%N;//as its should line between 0 to N-1 

        }
        private int searchinll(k key,int bi){
            LinkedList<Node>ll=buckets[bi];
            for(int i=0;i<ll.size();i++)
            {
                if(ll.get(i).key==key)
                {
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node>oldbucket[]=buckets;//first storing old buckets.
            this.N=N*2;
            this.n=0;
            buckets=new LinkedList[N];
            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }
            for(int i=0;i<oldbucket.length;i++){
                LinkedList<Node>ll=oldbucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    put(ll.get(i).key, ll.get(i).value);
                }
            }
        }
        public void put(k key,v value)
        {
            int bi=hashFunction(key);
            int di=searchinll(key,bi);//di=-1 means key dont exist
            if(di==-1){//keys doesnt exist
                buckets[bi].add(new Node(key, value));
                n++;
            }else{//key exist
                Node data=buckets[bi].get(di);
                data.value=value;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }
        public v get(k key)
        {
            int bi=hashFunction(key);
            int di=searchinll(key,bi);//di=-1 means key dont exist
            if(di==-1){//keys doesnt exist
                return null;
            }else{//key exist
                Node data=buckets[bi].get(di);
                return data.value;
            }
        }
        public Boolean containsKey(k key)
        {
            int bi=hashFunction(key);
            int di=searchinll(key,bi);//di=-1 means key dont exist
            if(di==-1){//keys doesnt exist
                return false;
            }else{//key exist
                return true;
            }
        }
        public v remove(k key)
        {
            int bi=hashFunction(key);
            int di=searchinll(key,bi);//di=-1 means key dont exist
            if(di==-1){//keys doesnt exist
                return null;
            }else{//key exist
                Node data=buckets[bi].remove(di);
                return data.value;
            }
        }
        public ArrayList<k> keyset(){
            ArrayList<k>keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(i);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
        
    }
    public static void main(String[] args) {
        HashMapp<String,Integer> map=new HashMapp<>();
        map.put("India",100);
        map.put("nepal",50);
        Integer ans=map.get("India");
        System.out.println(ans);
        System.out.println("yo");
    }
}
