package Array;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        //insertion
        map.put("India",120);
        map.put("us",30);
        map.put("china",150);
        //if we put same key then it will get updated.
        System.out.println(map);
        //search
        System.out.println(map.containsKey("India"));
        System.out.println(map.get("china"));
        //for iteration
        int arr[]={12,23,22};
        for(int val:arr)//iteration for array
        {
            System.out.println(val+" ");
        }
        for(Map.Entry<String,Integer>e:map.entrySet()){//iterantion for hashmap
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set <String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        //remove
        map.remove("china");
    }
}
