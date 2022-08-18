package com.infy.Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path = "D:\\Software\\Aspire_Workspace\\Jan22_Parameterization\\Data\\ASPIRE.xlsx";

		FileInputStream f = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(f);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
//		Row ro = sheet.createRow(0);
//		Cell co = ro.createCell(0);
//		co.setCellValue("ASPIRE");
		
		String[] s = {"ASPIRE1", "ASPIRE1","ASPIRE1","ASPIRE1","ASPIRE1",};
		for (int i=0; i<s.length; i++)
		{
			sheet.createRow(i).createCell(0).setCellValue(s[i]);
		}
		
		FileOutputStream fo = new FileOutputStream (path);
		wb.write(fo);
		

	}

}
