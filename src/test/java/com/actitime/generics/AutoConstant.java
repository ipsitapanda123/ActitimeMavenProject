package com.actitime.generics;

// We've stored all the constatnt datas that are going to remain SAME for the ENTIRE PROJECT. 
// eg:- URL of the app, Path of the Excel Sheet, Sheet names etc .

public interface AutoConstant 
{
String url = "https://demo.actitime.com";
	
	String excel_path = "./testdata/ActitimeData.xlsx";
	
	// String logfile_path = "./logfile/chromelog.txt"; //------> To store log file of the browser
	
	String sheet_name_login = "LoginData";
	
	String sheet_name_customer = "CustomerData";
}
