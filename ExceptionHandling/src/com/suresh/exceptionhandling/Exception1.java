package com.suresh.exceptionhandling;

public class Exception1 {
	
		void method1() {
			int x = 40/0;
		}
		void method2() {
			method1();
		}
		 void method3() {
			try {
				method2();
				}
			catch(Exception e) {
				System.out.println("Exception handled");
				System.out.println("Exception occured in method 1 and handled in method 3 that is Exception Propogation");
				
			}
		}
	public static void main(String[] args) {
		Exception1 obj = new Exception1();
		obj.method3();
	}
	}

