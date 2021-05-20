package bank;
import java.util.*;
public class bankdetail 
{
	String accno , phone, name;
	Integer balance = 0;
	void data(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account number,name,phone no,balance");
		accno = scanner.next();
		name = scanner.next();
		phone = scanner.next();
		balance = scanner.nextInt();
		scanner.close();
	}
	void show(){
		System.out.println("Account Number:" + accno + "\n Name:" + name + "\n Phone no:" + phone + "Balance" + balance);
	}

}