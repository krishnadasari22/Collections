package com.test;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int first=0,next=1;
		System.out.println("Print how many fibonacci u want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("The First" +n+" numbers are:");
		System.out.print(first+" "+next);
		for(int i=1;i<n-2;++i) {
			int sum=first+next;
			first=next;
			next=sum;
			System.out.print(" "+sum);
		}
		
		
	}
}

