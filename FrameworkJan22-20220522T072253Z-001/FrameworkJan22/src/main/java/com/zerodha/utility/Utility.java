package com.zerodha.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	static Workbook wbf;
	static String filepath;
	static FileInputStream file;
	
	public static String textTestData (int rowIndex, int cellIndex ) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		filepath=System.getProperty("user.dir")+"\\TestData\\ProjectData.xlsx";
		file = new FileInputStream(filepath);
		wbf = WorkbookFactory.create(file);
		String testStringValue = wbf.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return testStringValue;
	}
	public static boolean booleanTestData(int rowIndex, int cellIndex)
	{
		boolean testBooleanValue = wbf.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getBooleanCellValue();
		return testBooleanValue;
	}
	public static double numericTestData(int rowIndex, int cellIndex)
	{
		double testNumericValue = wbf.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
		return testNumericValue;
	}
	public static void screenshot(WebDriver driver) throws IOException
	{
		Date d = new Date();	// :, space
		String timeStamp = d.toString().replace(":", "_").replace(" ", "_");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("D:\\Java-projects\\Oct21\\SeleniumJan22\\Screenshots\\"+timeStamp+".jpg");
		File dest = new File(System.getProperty("user.dir")+"\\Screenshots\\"+timeStamp+".jpg");	
		FileHandler.copy(source, dest);
	}
	public static String propertydata(String key) throws IOException
	{
		Properties propertyObject = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\prop.properties");
		propertyObject.load(file);
		String value = propertyObject.getProperty(key);
		return value;
	}

}
