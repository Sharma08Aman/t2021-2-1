package test;

public class Calculator {
	public double add(double x,double y){
		return x+y;
	}
	public double sub(double x,double y){
		if(x>=y){
			return x-y;
		}
		else
			return y-x;
		
	}
	public double mul(double x,double y){
		return x*y;
	}
	public double div(double x,double y){
		return x/y;
	}	
}
