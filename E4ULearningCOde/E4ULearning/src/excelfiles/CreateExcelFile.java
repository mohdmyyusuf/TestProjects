package excelfiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateExcelFile {
	
		public static void main(String[] args) throws IOException {
			
			Workbook wb = new HSSFWorkbook();
			try 
			{
				OutputStream fileOut = new FileOutputStream("D:\\Eclipse_Workspace\\ExcelFiles\\TestExcel.xlsx");
				System.out.println("File has been created successfully...");
				wb.write(fileOut);
			} 
			catch(FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}

}
