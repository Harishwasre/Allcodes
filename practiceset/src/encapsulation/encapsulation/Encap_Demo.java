package encapsulation.encapsulation;

public class Encap_Demo {

	// 1. Variable must be private --> instance 
	private double balance;        
	
	// 2. public getter and setter method
	
	public void setbalance (double balance)
	{
		this.balance = balance;
	}
	
	public double getbalance ()
	{
		return balance;
	}
	
	public static void main(String[] args)
	{
		Encap_Demo e = new Encap_Demo();
		e.setbalance(5000);
		//variable declaration
		double b = e.getbalance();
		System.out.println(b);
		System.out.println("--------------");
		System.out.println(e.getbalance());
		
	}

}
