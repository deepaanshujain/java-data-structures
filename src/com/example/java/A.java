package com.example.java;

public interface A {
	default void click() {
		System.out.println("A.Click");
	}
	
	default void print() {
		System.out.println("A.print");
	}
}
