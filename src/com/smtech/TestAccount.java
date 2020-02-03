package com.smtech;

public class TestAccount {
public static void main(String[] args) {
	
	Account acc = new Account(454544L, "Ram Panday", "ram@gmail.com", 54515f);
	
	Account acc1 = new Account(454545L, "Hari Panday", "hari@gmail.com", 50004f);

	
//	acc.setAcc_no(45822110L);
//	acc.setName("Sakar Shrestha");
//	acc.setEmail("123@gmail.com");
//	acc.setAmount(32388f);
	
	System.out.println(acc.getAcc_no()+" " + acc.getName()+" "+ acc.getEmail()+" "+ acc.getAmount());
	
	System.out.println(acc1.getAcc_no()+" " + acc1.getName()+" "+ acc1.getEmail()+" "+ acc1.getAmount());
	
	}
}
