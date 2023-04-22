package com.datadrivenassignmnt_08thApril;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TN_Register_Exceldata {
	
	@DataProvider
	public static Object[][] getTNRegisterData() throws IOException{
		Object[][]data = readTNRegisterDataFromExcel("Sheet1");
		return data;
	}

	
	public static Object[][] readTNRegisterDataFromExcel(String sheetname) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\datadrivenassignmnt_08thApril\\TN_RegisterData.xlsx");
		FileInputStream input = new FileInputStream(file);
		
		try (XSSFWorkbook workbook = new XSSFWorkbook(input)) {
			XSSFSheet sheet = workbook.getSheet(sheetname);
			
			int rows = sheet.getLastRowNum();
			
			int cols = sheet.getRow(rows).getLastCellNum();
			//sheet.getRow(0).getLastCellNum();
			
			Object [][] data = new Object[rows][cols];
			
			for(int i = 0; i<rows;i++) {
				XSSFRow row = sheet.getRow(i+1);
				for(int j=0;j<cols;j++) {
					XSSFCell cell  = row.getCell(j);
					
				CellType celltype = cell.getCellType();
				
				switch(celltype) {
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j] = Integer.toString((int)cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				}
				
				
				}
			}
			
			return data;
		}
		
	}
}
