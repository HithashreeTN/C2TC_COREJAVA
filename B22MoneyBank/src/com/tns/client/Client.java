package com.tns.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		
		BankFactory bf = new MMBankFactory();
		
		SavingAcc sa = new MMSavingAcc(1,"Hithashree",2000,true);
		sa.withdraw(sa.getAccBal());
        sa.toString();
        
        CurrentAcc ca = new MMCurrentAcc(2,"TN",300,100);
        ca.withdraw(ca.getCreditLimit());
	    ca.toString();
	}

}
