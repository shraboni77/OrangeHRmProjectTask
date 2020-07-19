package com.bitm.SeleniumOnlineProject.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook= null;
	
	private static Sheet getSheet(int sheetNo) throws IOException
	{   
		//File file = new File("");
			
		File f= new File("src/main/java");
		File fs= new File(f,"data.xlsx");
		inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet=workbook.getSheetAt(sheetNo);
		return sheet;
	}
	
}
