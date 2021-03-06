package com.utilities; 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.common.usermodel.Hyperlink;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCreationHelper;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ExcelUtility {
	private static Logger logger  =  Logger.getLogger(ExcelUtility.class);
	
		HSSFWorkbook workbook = null;
		HSSFSheet sheet = null;
		String data ="";
		
		public  void getCellData(FileInputStream xl_file,int xl_sheet,int xl_row, int xl_column) throws IOException{
		 
	    HSSFWorkbook workbook = new HSSFWorkbook(xl_file);	
	    HSSFSheet sheet = workbook.getSheetAt(xl_sheet);
	    HSSFRow Row =   sheet.getRow(xl_row);
		HSSFCell cell=  Row.getCell(xl_column);
		
		switch(cell.getCellType()) {
        case Cell.CELL_TYPE_BOOLEAN:
            //System.out.print(cell.getBooleanCellValue() + "\t\t");
        	data = data + cell.getBooleanCellValue() + "\t\t";
            break;
        case Cell.CELL_TYPE_NUMERIC:
           // System.out.print(cell.getNumericCellValue() + "\t\t");
        	 data = data + cell.getNumericCellValue() + "\t\t";
            break;
        case Cell.CELL_TYPE_STRING:
            //System.out.print(cell.getStringCellValue() + "\t\t");
        	data = data + cell.getStringCellValue() + "\t\t";
            break;
		}
		logger.info(data);
		xl_file.close();
		xl_file=null;
		xl_sheet=0;
		xl_row=0;
		xl_column=0;
		
	}
	public int getNumberOfRows(){
		 return sheet.getLastRowNum();		
	}
	
	public int getNumberOfCols(){
		/*
		int noOfCols=0;
	    Iterator<Row> rowIterator = sheet.iterator();
	    rowIterator.next(); // Leaving Headings
	  
	    while(rowIterator.hasNext()) {
	        Row row = rowIterator.next();				
	        Iterator<Cell> cellIterator = row.cellIterator();
	        int temp=0;
	        while(cellIterator.hasNext()){	             
	            Cell cell = cellIterator.next();
	            temp++;
	        }
	        if (noOfCols < temp )
	        	noOfCols=temp;
	      return noOfCols;
	    } */		
		 
		return sheet.getRow(0).getLastCellNum();
	}
	
	
	public  String [][] loadExcel(final FileInputStream xl_file,final String xl_sheet ) throws Exception{	
		String [][] data_table = new String[300][30]; 		 
		workbook = new HSSFWorkbook(xl_file);
		sheet = workbook.getSheet(xl_sheet);		
		String xcelDataOnLog ="\n";
		int rowNo=0;	
		//debug
	    //Iterate through each rows from first sheet
	    Iterator<Row> rowIterator = sheet.iterator();
	    while(rowIterator.hasNext()) {
	    	xcelDataOnLog += (rowNo+1)+":\t";
	        Row row = rowIterator.next();	         
	        //For each row, iterate through each columns
			int colNo=0;
	        Iterator<Cell> cellIterator = row.cellIterator();
	        while(cellIterator.hasNext()){	             
	            Cell cell = cellIterator.next();
	 
	          //debug  	            
	            if(cell.toString().equals("")){	            	 
	            	xcelDataOnLog = xcelDataOnLog + "NULL,";
	            	data_table[rowNo][colNo] = "";
	            }else if(cell.toString().equalsIgnoreCase("Blank")){	            	 
	            	xcelDataOnLog = xcelDataOnLog + "BLANK,";
	            	data_table[rowNo][colNo] = "";
	            }else {            	 
	            	xcelDataOnLog = xcelDataOnLog + cell.toString()+", ";	            
	            	data_table[rowNo][colNo] = cell.toString().trim();
	            }  
	            
	            colNo++;
	        }
	     
	        rowNo++;
	        xcelDataOnLog = xcelDataOnLog + "\n";
	        
	    }	     
	    
	    //System.out.println(xcelDataOnLog);
	    //logger.info(xcelDataOnLog);
	    //   logger.info("======End of the Excel========");
	    xl_file.close();
	
	return data_table;
 }
	
	
	public void writeToExcel( String [][] results, int numberOfRows, int numberOfCols) {		
		
		try 
		{ 
		
		//creating a new workbook 
		HSSFWorkbook workbook = new HSSFWorkbook(); 
		
		//create a new worksheet 
		HSSFSheet worksheet1 = workbook.createSheet(); 
		
		//worksheet1.setColumnWidth((short)5,(short)10000); 
		System.out.println("Number of rows : "+ numberOfRows);
		
		
		for( int rowNo=0; rowNo < numberOfRows  ; rowNo++){
			System.out.println("Number of cols : "+ numberOfCols);
			for( int colNo=0; colNo < numberOfCols; colNo++){
				System.out.println("Writing Row Number: "+rowNo +"\n Writing Col Number: "+colNo);			
				HSSFFont font = workbook.createFont(); 				
				font.setColor(HSSFFont.COLOR_NORMAL); 					
				font.setFontHeightInPoints((short)8); 			
				
				HSSFRow row = worksheet1.createRow(rowNo); 			
				HSSFCell cell = row.createCell(colNo); 				 				
				System.out.println("Data :"+ results[rowNo][colNo].toString() +"."); 				
				cell.setCellValue(results[rowNo][colNo].toString());	
			}
		
			
		} 
		
		//create a stream to write this excel file 
		
		FileOutputStream fout = new FileOutputStream("./report/TestResult.xls"); 
		
		//write the excel file 
		workbook.write(fout); 
		
		//flush the stream 
		fout.flush(); 
		
		//close the stream 
		fout.close(); 
		
		System.out.println("Excel file generated successfully ! "); 
		
		} 
		catch(Exception e) 
		{ 
		System.out.println("Exception on this page : "+e); 
		} 
	}
	
	public void copyWorkSheet(String srcXlsFileName,String xlsSheetName,String dstXlsFileName) throws Exception{
		
	        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcXlsFileName));
	        HSSFWorkbook workbook = new HSSFWorkbook(bis);
	        HSSFWorkbook myWorkBook = new HSSFWorkbook();
	        HSSFSheet sheet = null;
	        HSSFRow row = null;
	        HSSFCell cell = null;
	        HSSFSheet mySheet = null;
	        HSSFRow myRow = null;
	        HSSFCell myCell = null;
	       // int sheets = workbook.getNumberOfSheets();
	        int fCell = 0;
	        int lCell = 0;
	        int fRow = 0;
	        int lRow = 0;
	       // for (int iSheet = 0; iSheet < sheets; iSheet++) {
	          //  sheet = workbook.getSheetAt(iSheet);
	            sheet = workbook.getSheet(xlsSheetName);
	            if (sheet != null) {
	                mySheet = myWorkBook.createSheet(sheet.getSheetName());
	                fRow = sheet.getFirstRowNum();
	                lRow = sheet.getLastRowNum();
	                for (int iRow = fRow; iRow <= lRow; iRow++) {
	                    row = sheet.getRow(iRow);
	                    myRow = mySheet.createRow(iRow);
	                    if (row != null) {
	                        fCell = row.getFirstCellNum();
	                        lCell = row.getLastCellNum();
	                        for (int iCell = fCell; iCell < lCell; iCell++) {
	                            cell = row.getCell(iCell);                            
	                            myCell = myRow.createCell(iCell);               
	                            
	                            if (cell != null) {
	                                myCell.setCellType(cell.getCellType());
	                                switch (cell.getCellType()) {
	                                case HSSFCell.CELL_TYPE_BLANK:
	                                    myCell.setCellValue("");
	                                    break;

	                                case HSSFCell.CELL_TYPE_BOOLEAN:
	                                    myCell.setCellValue(cell.getBooleanCellValue());
	                                    break;

	                                case HSSFCell.CELL_TYPE_ERROR:
	                                    myCell.setCellErrorValue(cell.getErrorCellValue());
	                                    break;

	                                case HSSFCell.CELL_TYPE_FORMULA:
	                                    myCell.setCellFormula(cell.getCellFormula());
	                                    break;

	                                case HSSFCell.CELL_TYPE_NUMERIC:
	                                    myCell.setCellValue(cell.getNumericCellValue());
	                                    break;

	                                case HSSFCell.CELL_TYPE_STRING:
	                                    myCell.setCellValue(cell.getStringCellValue());
	                                    break;
	                                default:
	                                    myCell.setCellFormula(cell.getCellFormula());
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	       /// }
	        bis.close();
	        BufferedOutputStream bos = new BufferedOutputStream(
	                new FileOutputStream(dstXlsFileName, true));
	        myWorkBook.write(bos);
	        bos.close();
	    }
	
	
	public static void writeToExcelCell(String data,int xl_row,int xl_column, String ExcelSheetName, String ExcelFileName) throws IOException{
		
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(ExcelFileName))); 
		HSSFSheet sheet = workbook.getSheet(ExcelSheetName);
		HSSFRow Row = sheet.getRow(xl_row);
		HSSFCell cell= Row.getCell(xl_column);
		
		cell.setCellValue(data);	 
	    FileOutputStream fileOut = new FileOutputStream(new File(ExcelFileName));
	    workbook.write(fileOut);
	    fileOut.flush();
	    fileOut.close();
	    fileOut = null;
	}
	
	public static void appendToExcelCell(String data,int xl_row,int xl_column, String ExcelSheetName, String ExcelFileName) throws IOException{
		boolean append = true; 
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(ExcelFileName))); 
		HSSFSheet sheet = workbook.getSheet(ExcelSheetName);
		HSSFRow Row = sheet.getRow(xl_row);
		HSSFCell cell= Row.getCell(xl_column);
		if(append){
			String existingContent = cell.getStringCellValue();
			if( !existingContent.equalsIgnoreCase("Blank") && !existingContent.equalsIgnoreCase(""))
					data = existingContent +"\n" + data;
		}
			
		cell.setCellValue(data);	 
	    FileOutputStream fileOut = new FileOutputStream(new File(ExcelFileName));
	    workbook.write(fileOut);
	    fileOut.flush();
	    fileOut.close();
	    fileOut = null;
	}	
	
	
	public static void writeToExcelCellAsHyperlink(String displayText, String hyperlinkText,int xl_row,int xl_column, String ExcelSheetName, String ExcelFileName) throws IOException{
		
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(ExcelFileName))); 
		HSSFSheet sheet = workbook.getSheet(ExcelSheetName);
		HSSFRow Row = sheet.getRow(xl_row);
		HSSFCell cell= Row.getCell(xl_column);
		
		HSSFCreationHelper helper = workbook.getCreationHelper();
        HSSFHyperlink file_link = helper.createHyperlink(Hyperlink.LINK_FILE);
        file_link.setAddress(hyperlinkText);
        
        cell.setCellValue(displayText);	          
        cell.setHyperlink(file_link);
		
	    FileOutputStream fileOut = new FileOutputStream(new File(ExcelFileName));
	    workbook.write(fileOut);
	    fileOut.flush();
	    fileOut.close();
	    fileOut = null;
	}	
	
	
	
	// Create Excel Rows from the begining
	public static void addRowsToExcelSheet(int nRowsToAdd, String ExcelSheetName, String ExcelFileName){
		
		try {
			HSSFWorkbook workbook;
			workbook = new HSSFWorkbook(new FileInputStream(new File(ExcelFileName)));
			HSSFSheet sheet = workbook.getSheet(ExcelSheetName);
			
			int lastRow = sheet.getLastRowNum();
			
			//System.out.println("No.of Rows:" + lastRow);		
					
			for(int rowNo = lastRow ; rowNo <= nRowsToAdd ; rowNo ++ ){
				Row row = sheet.createRow(rowNo);	
				// columns for each Row
				for(int colNo =0; colNo < 10; colNo ++){
					row.createCell(colNo);
				}
				
			}
			
			//System.out.println("No.of Rows:" +sheet.getLastRowNum());			
			FileOutputStream fileOut = new FileOutputStream(new File(ExcelFileName));
		    workbook.write(fileOut);
		    fileOut.flush();
		    fileOut.close();
		    fileOut = null;
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
	
	
	
	
	
	public static void appendRowsAtLast(int nRowsToAdd, String ExcelSheetName, String ExcelFileName){

		try {
			
			HSSFWorkbook workbook;
			workbook = new HSSFWorkbook(new FileInputStream(new File(ExcelFileName)));
			HSSFSheet sheet = workbook.getSheet(ExcelSheetName);
			HSSFRow newRow;
			//System.out.println("No.of Rows:" +sheet.getLastRowNum());			
			int createNewRowAt =  sheet.getLastRowNum();     // 9; //Add the new row between row 9 and 10			
			
			for(int i=1; i<= nRowsToAdd; i++){
				
				sheet.shiftRows(createNewRowAt, sheet.getLastRowNum(), 1, true, false);			
				newRow = sheet.createRow(createNewRowAt);
				newRow = sheet.getRow(createNewRowAt);	
				// Cells per each Row = 10 (default)
				for(int colNo =0; colNo < 10; colNo ++){
					newRow.createCell(colNo);
				}
				
			}
			
			//System.out.println("No.of Rows:" +sheet.getLastRowNum());			
			FileOutputStream fileOut = new FileOutputStream(new File(ExcelFileName));
		    workbook.write(fileOut);
		    fileOut.flush();
		    fileOut.close();
		    fileOut = null;
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public static void insertRowsToExcelSheet( int createNewRowAt, int nRowsToAdd, String ExcelSheetName, String ExcelFileName){

		try {
			
			HSSFWorkbook workbook;
			workbook = new HSSFWorkbook(new FileInputStream(new File(ExcelFileName)));
			HSSFSheet sheet = workbook.getSheet(ExcelSheetName);
			HSSFRow newRow;
			
			
			//System.out.println("No.of Rows:" +sheet.getLastRowNum());			
			
			for(int i=1; i<= nRowsToAdd; i++){
				
				sheet.shiftRows(createNewRowAt, sheet.getLastRowNum(), 1, true, false);			
				newRow = sheet.createRow(createNewRowAt);
				newRow = sheet.getRow(createNewRowAt);	
				// Cells per each Row = 10 (default)
				for(int colNo =0; colNo < 10; colNo ++){
					newRow.createCell(colNo);
				}
				
			}
			
			//System.out.println("No.of Rows:" +sheet.getLastRowNum());			
			FileOutputStream fileOut = new FileOutputStream(new File(ExcelFileName));
		    workbook.write(fileOut);
		    fileOut.flush();
		    fileOut.close();
		    fileOut = null;
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void createExcel(String fileName) throws IOException{
		 String filename = "C://Users//ctl-user//Desktop//Jun17Workspace//FKartProject//Results"+fileName+".xlsx" ;
		 HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(filename)));
		 FileOutputStream fos = new FileOutputStream(fileName);
         workbook.write(fos);
         fos.flush();
         fos.close();		
	}
public static void writeToExcelCell(int xl_row,String data, String ExcelSheetName, String ExcelFileName) throws IOException{
		
	    String[] columns=data.split(",");
	   // int columns=col.length;
	    int i=0;
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(ExcelFileName))); 
		HSSFSheet sheet = workbook.getSheet(ExcelSheetName);
		HSSFRow Row = sheet.getRow(xl_row);
		 for ( i=0;i<columns.length;i++ ){
		HSSFCell cell= Row.getCell(i);
		
		cell.setCellValue(data);
		 }
	    FileOutputStream fileOut = new FileOutputStream(new File(ExcelFileName));
	    workbook.write(fileOut);
	    fileOut.flush();
	    fileOut.close();	    
	    fileOut = null;
	}	
 
};