package bank;

import java.util.*;

public class deposit extends bankdetail {
	Integer depositamount,totalamn;
	void getdata() 
	{
		super.data();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Deposit ammount:");
		depositamount = scanner.nextInt();
		totalamn = balance + depositamount;
		scanner.close();
	}
	void display() 
	{
		super.show();
		System.out.println("total amount:" + totalamn);
	}
}