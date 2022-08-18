package method_Calling;

//import nested_For_demo.Nested_For_Demo;
import nested_For_demo.Nested_For_Demo;

public class MMCDC 
{
	// 2. Making a method call from different class --> MMCDC
	
	public static void main(String[] args)
	{
		// Static Method
		// classname.staticmethodName
		MMCWC.Addition();
		
		// Non Static Method --> object creation
		MMCWC m = new MMCWC(); // This is from Same package
	//	m.Substraction();
		m.multiplication();
		
		Nested_For_Demo n = new Nested_For_Demo();  // This is from other package
		n.demo();
		//n.demo2();
		// If we create a protected method then we can not call that method--> condition--> method must be belong to other package
		// If method is belong to same package then we can call that method.
	}
}
