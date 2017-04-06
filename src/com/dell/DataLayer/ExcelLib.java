package com.dell.DataLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib 
{
	public static String readExcelData(String sheetName, int rowNum, int colNum) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Excel\\Lib.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNum);
		String celVal = row.getCell(colNum).getStringCellValue();
		return celVal;
	}
	
	public static void setExcelData(String sheetName, int rowNum, int colNum, String value) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Excel\\Lib.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cel = row.createCell(colNum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream("D:\\Excel\\Lib.xlsx");
		
		workbook.write(fos);
		fos.flush();
		fos.close();
	}
	
	public static void readAllCellData(String sheetName, int colNum)throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Excel\\Lib.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = null;
		
		int totalrow = sheet.getLastRowNum();
		
		for(int i=0; i<=totalrow; i++)
		{
			System.out.println(sheet.getRow(i).getCell(colNum).getStringCellValue());
		}
		
	}
	
	public static void readAllRowData(String sheetName, int rowNum)throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Excel\\Lib.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNum);
		
		int totalCol = row.getLastCellNum();
		
		for(int i=0; i<=totalCol; i++)
		{
			System.out.println(row.getCell(i).getStringCellValue());
		}
		
	}
}
