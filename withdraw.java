package bank;
import java.util.*;
public class withdraw extends bankdetail{
	int withdraw, totalamn;
	void getdata() 
	{
		super.data();
		Scanner scanner = new Scanner(System.in);
		System.out.println("WITHDRAW ammount:");
		withdraw = scanner.nextInt();
		totalamn = balance - withdraw;
		 //if(withdraw <= "500"){
		
		scanner.close();
	}
	void display() 
	{
		super.show();
		System.out.println("total amount:"+totalamn);
	}
}