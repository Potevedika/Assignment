package schoolwebapp;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class UtilityClass 
{
	public static String getTD(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sanja\\OneDrive\\Desktop\\Study\\3rd Sept Mrng\\3rdSeptMrngA.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();	
		return value;
	}
	
	
	
	public static String readDataFromPF(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\schoolwebapp\\PropertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return value;
	}
	

}

