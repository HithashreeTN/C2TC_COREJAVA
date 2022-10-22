package com.cg.application;

import com.cg.framework.SavingAcc;


public class MMSavingAcc extends SavingAcc{
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

   private static final float MINBAL = 50.f;
   
	public static float getMinbal() {
	return MINBAL;
}
	public  void withdraw(float accBal) {
		System.out.println("saving account user,withdraw money and remaining balance is "+ accBal);
		
	}
	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}


	



