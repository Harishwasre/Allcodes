package abstraction;

public class Concrete_Class extends Abstract_Test_Class
{

	//	@Override
	//	public void mobilenumber() 
	//	{
	//		System.out.println("789456123");	
	//	}

	public static void main(String[] args)
	{
		Concrete_Class a = new Concrete_Class(); // Error --> in constructor
		a.name();
		a.aadhar();
		a.mobilenumber();
	}

	@Override
	public void mobilenumber() {
		// TODO Auto-generated method stub

	}

}
