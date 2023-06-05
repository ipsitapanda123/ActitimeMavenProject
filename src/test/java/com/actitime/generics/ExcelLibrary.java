package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//We've stored different methods to perform FILE MANIPULATION. 
//eg:- read and write data,count number of rows and columns  etc .

public class ExcelLibrary implements AutoConstant
{
	public static String getcellvalue(String sheet , int row , int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		String cellvalue=workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
	}
}