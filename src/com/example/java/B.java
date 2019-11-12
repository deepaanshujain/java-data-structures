package com.example.java;

public interface B {
	default void click() {
		System.out.println("B.Click");
	}
	
	default void press() {
		System.out.println("B.press");
	}
}
