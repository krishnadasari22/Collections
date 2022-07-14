package com.telegramcodingquestions;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			long[] arr=new long[3];
			for(int i=1;i<3;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			if(arr[2]>arr[1]+arr[0]) {
				System.out.println("Impossible");
			}else {
				System.out.println("Possible");
			}
		}
	}


}
