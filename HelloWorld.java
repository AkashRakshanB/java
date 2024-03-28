package com.udemy.firstjavaproject;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException  {
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$%^&*! ";
		String in="Hello World!";
		char[] ch1=str.toCharArray();
		char[] ch2=in.toCharArray();
		String output="";
		for(int i=0;i<ch2.length;i++) {
			for(int j=0;j<ch1.length;j++) {
				System.out.print(output);
				Thread.sleep(25);
				System.out.println(ch1[j]);
				if(ch2[i]==ch1[j]) {
					output=output+ch2[i];
					break;
				}
			}
		}
		

	}

}
