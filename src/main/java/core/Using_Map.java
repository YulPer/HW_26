package core;

import java.util.*;

public class Using_Map {

       public static void main(String args[]) {
              Map<Integer, String> hm = new HashMap<Integer, String>();
              // Hashtable; LinkedHashMap; TreeMap
              // HashMap put
              long startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {hm.put(i, "John Smith");}
              long endTime = System.nanoTime();
              System.out.println("HashMap puts:  " + (endTime - startTime));
             
              // HashMap get
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {hm.get(i);}
              endTime = System.nanoTime();
              System.out.println("HashMap gets:  " + (endTime - startTime));
             
              // HashMap remove
              startTime = System.nanoTime();
              for (int i = 0; i < 1_000_000; i++) {hm.remove(i);}
              endTime = System.nanoTime();
              System.out.println("HashMap remove:  " + (endTime - startTime));
      }
}