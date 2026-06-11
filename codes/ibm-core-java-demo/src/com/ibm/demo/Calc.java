package com.ibm.demo;

//@FunctionalInterface
public interface Calc {
	public abstract int addNums(int i, int j);
}

class CalcMethods implements Calc {

	@Override
	public int addNums(int i, int j) {
		
		return i + j;
	}

}
