package Screenshot;





import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShoot1 {

	public static void main(String[] args) throws IOException
	{
		String key="webdriver.chrome.driver";
		String value = "E:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe";
		String url="https://nxtgenaiacademy.com/multiplewindows/";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	WebElement dis = driver.findElement(By.xpath("//button[@onclick=\"newBrwWin()\"]"));				dis.click();
	      boolean takesc = dis.isDisplayed();
		if(takesc) {
		File tc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File f=tc.getScreenshotAs(OutputType.FILE);
		String path="E:\\New folder (2)\\harish123.png";
		File dest=new File("E:\\New folder (2)\\harish123.png");
		FileHandler.copy(tc, dest);
		}
	}

}
