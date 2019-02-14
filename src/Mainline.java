import banking.*;


public class Mainline
{
	public static void main(String[] args) {
		Savings sav = new Savings();
		Checking chk = new Checking();
		
		try 
		{
			sav.deposit(1000);
			sav.withdraw(200);
			chk.deposit(5000);
			chk.withdraw(2000);
			System.out.println("Balance in Saving is " + sav.getBalance());
			System.out.println("Balance in Cchecking is " + chk.getBalance());
			chk.transferTo(sav, 500);
			System.out.println("Balance in Saving is " + sav.getBalance());
			System.out.println("Balance in Cchecking is " + chk.getBalance());
		}
		catch(Exception e)
		{
			System.out.println("An Error has occurred");
		}
	}
}
