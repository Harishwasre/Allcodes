package Screenshot;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot extends Genralization
{
	static WebDriver driver;

	public void tc2() {
		String key ="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url= "https://www.instagram.com/";
		System.setProperty(key,value);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	public static void main(String[] args) throws IOException
	{
		TakeScreenShot tsc=new TakeScreenShot();
		tsc.tc2();
		Screenshot(driver);
		driver.quit();
		
	}

}
