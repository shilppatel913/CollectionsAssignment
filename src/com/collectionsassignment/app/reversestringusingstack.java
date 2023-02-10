package com.collectionsassignment.app;
import java.util.Scanner;
import java.util.Stack;

public class reversestringusingstack {
	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String to reverse using stack");
		String str=scan.next();
		String revStr="";
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			stack.push(ch);
		}
		
		while(!stack.isEmpty()) {
			char ch=stack.pop();
			revStr+=Character.toString(ch);
		}
		
		System.out.println(revStr);
		
	}

}
