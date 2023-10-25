package com.valtech.training.day2;

public interface Arithmetic {
	
	int zero =0; //should be well defined at the declaration
	
	int add(int a, int b); //method
	
	int sub(int a, int b);
	
	int mul(int a, int b);
	
	int div(int a, int b)throws DivideByZeroException;
	
}
