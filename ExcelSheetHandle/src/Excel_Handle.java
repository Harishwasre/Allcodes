import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Handle {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path ="E:\\Aspire\\New folder\\New Microsoft Office Excel Worksheet.xlsx";
		FileInputStream f=new FileInputStream(path);
		Workbook value = WorkbookFactory.create(f);
		Sheet value1 = value.getSheet("Sheet1");
				   Row row = value1.getRow(0);
				   Cell col = row.getCell(0);
				   CellType result = col.getCellType();
				  

	}

}
