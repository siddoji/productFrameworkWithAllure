package commonFunction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utility_Function {
	
	public static void evidencefilegenerator(String filename,String responseBody,String requestBody) throws IOException {
		
		// fetch path and save into variable 
		File newfile=new File("G:\\restFile\\product\\"+filename+".txt");
		System.out.println("new file is creating to save data :"+newfile.getName());
		
		FileWriter datawrite=new FileWriter(newfile);
		datawrite.write("request body "+requestBody+"\n\n");
		datawrite.write("response body"+responseBody);
		datawrite.close();
		
		System.out.println("requestBody and responseBody saved in file :"+newfile.getName());
	
	}
	
}
