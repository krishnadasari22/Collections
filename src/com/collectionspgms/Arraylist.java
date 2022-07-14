package com.collectionspgms;

import java.util.*;  
public class Arraylist{  
public static void main(String args[]){  
List<String> list=new LinkedList<String>();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
list.forEach((n)->{ 
	System.out.println(n);
	}
);
} 
}
