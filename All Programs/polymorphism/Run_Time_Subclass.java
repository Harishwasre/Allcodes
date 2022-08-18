package polymorphism;

public class Run_Time_Subclass extends Run_Time_Superclass
{
	public void property (int b) // We can only override the nonstatic method
	{
		System.out.println("This property is belongs to Son");
	}
	
//	public void House (String w) // We cannot override the static method
//	{
//		System.out.println("This hous is belong to father");
//	}

}
