package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShoot2 {

	public static void main(String[] args) throws IOException
	{
		String key ="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url="https://popsql.com/";
		System.setProperty(key,value);
		WebDriver d =new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
		Date da=new Date();
		TakesScreenshot t=((TakesScreenshot)d);
		File get=t.getScreenshotAs(OutputType.FILE);
		File dest =new File("E:\\New folder (2)\\"+da.toString().replace(':','_')+"harish.png");
		FileHandler.copy(get, dest);
		d.close();
	}

}
