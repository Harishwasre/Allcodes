package com.infy.Parameterization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Handling {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path = "D:\\Selenium\\ApachePOI\\ASPIRE.xlsx";

		FileInputStream f = new FileInputStream(path);

		//		String value = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		//CellType type = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(2).getCellType();
		//String value1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		//System.out.println(value1);

		//		System.out.println(type);

		Workbook wb = WorkbookFactory.create(f);
		String value1 = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
		double value2 = wb.getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(value2);

		Sheet sheet = wb.getSheet("Sheet1");
		int lr = sheet.getLastRowNum();
		short lc = sheet.getRow(1).getLastCellNum();

		System.out.println("No. of Rows= "+lr);
		System.out.println("No. of Column= "+lc);

		for (int i=0; i<=lr; i++)
		{
			for (int j=0; j<lc; j++)
			{
				//String result = sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(result);
				Cell result = sheet.getRow(i).getCell(j);
				switch (result.getCellType())
				{
				case STRING: System.out.print(result.getStringCellValue());break;
				case NUMERIC: System.out.print(result.getNumericCellValue());break;
				}
				System.out.print("  ||  ");
			}
			System.out.println(" ");
		}
	}
}
