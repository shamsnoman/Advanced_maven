package com.fileHandling_08thApril_2023;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	
	@DataProvider
	public static Object[][] getRediffData() throws IOException {
		Object[][] data = readDataFromExcel("LoginTN");
		return data;
	}
	
	
	@DataProvider
	public static Object[][] getTNData() throws IOException {
		Object[][] data = readDataFromExcel("LoginRediff");
		return data;
	}
	
	

	public static Object[][] readDataFromExcel(String sheetName) throws IOException {

		File file = new File(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\fileHandling_08thApril_2023\\Rediff_TN_data.xlsx");
		FileInputStream fileInput = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet(sheetName);

		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
	 

		Object[][] data = new Object[rows][columns];

		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i + 1);
			for (int j = 0; j < columns; j++) {
				XSSFCell col = row.getCell(j);
				CellType cellType = col.getCellType();

				switch (cellType) {
				case STRING:
					data[i][j] = col.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j] = Integer.toString((int) col.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j] = col.getBooleanCellValue();
					break;
				}
			}

		}
		return data;

	}

}
