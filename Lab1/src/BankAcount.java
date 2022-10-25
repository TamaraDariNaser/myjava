
public class BankAcount {
	private int balance ;
	private  String accNo ;
	 int deposit(int amount) 
	{
	return amount;	
	}
	 void PrintBalance() 
	{
		
	}
	public int GetBalance()
	{ 
		return this.balance;
		
	}
	public void SetBalance(int Balance)
	{ 
		 this.balance=Balance;
		
	}
	public String GetAccNO()
	{ 
		return this.accNo;
		
	}
	public void SetAccNO(String AccNo)
	{ 
		 this.accNo=AccNo;
		
	}
	public static void main(String[] args) {
		BankAcount bank = new BankAcount ();
		bank.SetAccNO("123456");
		bank.SetBalance(1000);
		System.out.println("the balance.."+ bank.GetBalance());
		System.out.println("the acount number.."+ bank.GetAccNO());

	}

}
