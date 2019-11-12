package com.example.java;

public class MultipleInterface implements A,B {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		A.super.click();
	}
	
	public void bClick() {
		// TODO Auto-generated method stub
		B.super.click();
	}
	
	public static void main(String args[]) {
		MultipleInterface mi = new MultipleInterface();
		mi.click();
		mi.bClick();
		mi.press();
		mi.print();
	}
}
