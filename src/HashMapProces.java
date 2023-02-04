import java.util.Map;
import java.util.HashMap;
import java.util.*;

    //HashMap Operations
     class HashMapProcess {
        public static void main(String args[]){

            HashMap<Integer, String> h=new HashMap<Integer,String>();
            //Adding elements to hashmap
            h.put(1,"sud");
            h.put(2,"shash");
            h.put(3,"jish");
            h.put(4,"christ");
            h.put(5,"shrav");
            h.put(6,"sush");
            h.put(7,"supri");
            h.put(8,"riya");
            h.put(9,"vaish");
            h.put(10, "shrr");

            //Printing keys
            System.out.println("Keys: ");
            for(Map.Entry e: h.entrySet()){
                System.out.println(e.getKey());
            }
            //Printing Values
            System.out.println("Values: ");
            for(Map.Entry e: h.entrySet()){
                System.out.println(e.getValue());
            }

            //Find length
            System.out.println("Length of the hashmap "+h.size());

            //Replace a value
            System.out.println("after replacing ");
            h.replace(2,"shash","kushii");
            System.out.println(h);

            //Remove a key value pair
            h.remove(9,"vaish");
            System.out.println("After removing the data ");
            System.out.println(h);

            //Clear
            h.clear();
            System.out.println("after clearing the hashmap");
            System.out.println(h);
        }
    }

