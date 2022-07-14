package com.datastructures;

import java.util.Stack;

public class StackUsingJava {
	static void Push(Stack<Integer> s) {
		for(int i=0;i<5;i++) {
			s.push(i);
		}
	}
		public static void main(String[] args) {
			Stack<Integer> st=new Stack<>();
			Push(st);
			System.out.println(st);
		
	}

}
