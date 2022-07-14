package com.collectionspgms;

import java.util.Vector;
import java.util.Collections;
 
public class MaxElement {
public static void main(String[] args) {
      Vector vec = new Vector();
      vec.add(new Double("24.42"));
      vec.add(new Double("45.32"));
      vec.add(new Double("42.42"));
      vec.add(new Double("57.39"));
      vec.add(new Double("23.34"));
      Object object1 = Collections.max(vec);
      System.out.println("Maximum Element is : " + object1);
   }
}
