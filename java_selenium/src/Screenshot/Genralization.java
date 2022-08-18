package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Genralization
{
	public static void  Screenshot(WebDriver driver) throws IOException 
	{
		TakesScreenshot tc=((TakesScreenshot)driver);
		File f=tc.getScreenshotAs(OutputType.FILE);
		File fc=new File("E:\\drivers of browser//harish.png");
		FileHandler.copy(f, fc);
		
	}

}
