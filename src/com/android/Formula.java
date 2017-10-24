package com.android;

public class Formula {
	
	private double num1;
	private double num2;
	private char operation;
	
	public Formula(){
		this.num1 = 0.0;
		this.num2 = 0.0;
		this.operation = '\0';
	}
	
	public Formula(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
		this.operation = '\0';
	}
	
	public Formula(double num1, double num2, char operation){
		this.num1 = num1;
		this.num2 = num2;
		this.operation = operation;
	}
	
	public void setNum1(double num1){
		this.num1 = num1;
	}
	public void setNum2(double num2){
		this.num2 = num2;
	}
	public void setOperation(char operation){
		this.operation = operation;
	}
	
	public double getNum1(){
		return num1;
	}
	public double getNum2(){
		return num2;
	}
	public char getOperation(){
		return operation;
	}
	
	public double add(){
		return num1+num2;
	}
	public double subtract(){
		return num1-num2;
	}
	public double divide(){
		double c;
		try{
			c=num1/num2;
		}
		catch(ArithmeticException exe){
			c=0;
		}
		return c;
	}
	public double multiply(){
		return num1*num2;
	}
	
	public String Hex(int a){
		String b = Integer.toHexString(a);
		return b;
	}
	public String Bin(int a){
		String b = Integer.toBinaryString(a);
		return b; 
	}
	public String Oct(int a){
		String b = Integer.toOctalString(a);
		return b;
	}
	public int BackBin(String a){
		int b = Integer.parseInt(a,2);
		return b;
	}
	public int BackOct(String a){
		int b = Integer.parseInt(a, 8);
		return b;
	}
	public int BackHex(String a){
		int b = Integer.parseInt(a,16);
		return b;
	}
}
