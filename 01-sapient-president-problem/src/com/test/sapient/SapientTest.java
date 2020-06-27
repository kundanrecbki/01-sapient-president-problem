package com.test.sapient;

public class SapientTest {

	
	public int whoIsElected(int n, int k) 
	{ 
		int sum = 0;
		for(int i = 2; i <= n; i++){
			sum = (sum + k) % i;
		}
		return sum + 1;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("New class president is at position: " + new SapientTest().whoIsElected(100, 2)); 
	}

}
