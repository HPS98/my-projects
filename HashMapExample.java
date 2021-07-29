import java.util.*;
public class HashMapExample {

    public static void main(String[] args) {
    HashMap<Integer, String> hm=new HashMap<Integer, String>();

      hm.put(1, "USA");
      hm.put(2, "Canada");                       // Inserting Key and Value Pair
      hm.put(3, "India");
      hm.put(4, "NewZealand");

          System.out.println("\n"+hm+"\n");

        hm.remove(4);                           // Removing Key and Value Pair Through Key 

          System.out.println(hm+"\n");

        hm.remove(3, "India");                  // Removing Key and Value Pair Through Key and Value Both

          System.out.println(hm+"\n");


        hm.put(3, "India");

        hm.put(4, "NewZealand");                 // Inserting Deleted Key and Value Pair Again

          System.out.println(hm+"\n");


           for(Map.Entry e  : hm.entrySet()){                // Invoking getKey() and getValue() Methods in Map.Entry Interface 
          
               System.out.println(e.getKey()+" "+e.getValue()); 

                     }   


                              }

                                        }