package bank;
import java.util.*;
public class resbank{

	public static void main(String[] args) 
	{   
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press D to deposit and W to withdraw");
        String instruction = scanner.next();
        if(instruction.equals("D")) 
        {
            deposit depositObj=new deposit();
            depositObj.getdata();
            depositObj.display();
        }
        if(instruction.equals("W")) 
        {
            withdraw withdrawObj=new withdraw();
            withdrawObj.getdata();
            withdrawObj.display();
        }

        scanner.close();
    }
}