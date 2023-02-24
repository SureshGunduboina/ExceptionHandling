package com.suresh.exceptionhandling;

public class TryCatch {
		public static void main(String[] args) {
		
			try {
			
			int a[] = new int[5];
			a[6] =40;
		}
		   catch(ArithmeticException e) {
		    	System.out.println("Task 1 completed");
		    }
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("task 2 completed");
			}
			System.out.println("rest of the code is Working");
	        int x =50,y=70;
	        int sum = x+y;
	        System.out.println(sum);
	        		
			
	}
		
	}	
