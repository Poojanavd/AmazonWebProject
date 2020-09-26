package com.amazonweb.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public interface ExcelFileReader {

	String TEST_DATA = "TestData";

	public static String getCellData(String key) throws InvalidFormatException, IOException {
		FileInputStream fis = null;
		Workbook wb = null;
		Sheet sheetName = null;
		String value = "";
		try {

			fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/testdata/AmazonTestData.xlsx");
			wb = WorkbookFactory.create(fis);
			sheetName = wb.getSheet(TEST_DATA);
			int noOfRows = sheetName.getPhysicalNumberOfRows();
			for (int i = 1; i < noOfRows; i++) {
				Row r = sheetName.getRow(i);
				if ((r.getCell(0)).getStringCellValue().equalsIgnoreCase(key)) {
					value = r.getCell(1).getStringCellValue();
				}
			}
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
		return value;
	}
}
