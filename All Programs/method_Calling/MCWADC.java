package method_Calling;

public class MCWADC 
{
	//4. Making method call with argument in different class.
	public static void main(String[] args)
	{
		// For non static method calling
		
		MMCWAWC m = new MMCWAWC();
		m.multiplication("Aspire");
		m.Substraction('q', 0, "Aspire");
		
		// For static method calling
		MMCWAWC.Addition(5);
		
	}
}
