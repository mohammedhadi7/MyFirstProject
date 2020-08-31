package com.escape.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary {
	
	
	
	
	public  String excelLib(String sheetname, int rowNum, int cellNum) {
		String retVal=null;
		
		
		try {
			FileInputStream ff=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//escape//testdata//ReadExcel.xlsx");
		Workbook wb=	WorkbookFactory.create(ff);
		Sheet sh=wb.getSheet(sheetname);
		Row rw=sh.getRow(rowNum);
		Cell cel=rw.getCell(cellNum);
		retVal=cel.getStringCellValue();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retVal;
}

	public int lastRow(String sheetname) {
		int retVal=0;
		try {
			FileInputStream ff=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//escape//testdata//ReadExcel.xlsx");
		Workbook wb=	WorkbookFactory.create(ff);
		Sheet sh=wb.getSheet(sheetname);
		retVal=sh.getLastRowNum();
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retVal;
}
	
	
	
	
		
	}


