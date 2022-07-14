package com.collectionspgms;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(4);
		arr.add(8);
		arr.add(3);
		arr.add(9);
		Consumer<Integer> con=(n)->{ System.out.println(n);};
		arr.forEach(con);

	}

}
