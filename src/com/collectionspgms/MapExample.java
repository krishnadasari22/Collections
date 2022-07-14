package com.collectionspgms;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map mp=new HashMap();
		mp.put(1,"krishna");
		mp.put(2, "ramu");
		mp.put(4, "anand");
		System.out.println(mp);
		Set set=mp.entrySet();
		Iterator itr=set.iterator();
		while (itr.hasNext()) {
			Map.Entry ent=(Map.Entry)itr.next();
					System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}

}
