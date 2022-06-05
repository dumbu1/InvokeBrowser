package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	private static FileInputStream propertyFile;
	private static Properties obj_Properties;
	private static String propertyFileName;
	
	//constructor
	public PropertyReader(String propertyFileName) {
		this.propertyFileName=propertyFileName;
	}
	
	public Properties propertyReader() {
		
		try {
			
			//propertyFile=new FileInputStream("C:\\Users\\Krishna Mohan\\eclipse-workspace\\sampleproject\\src\\test\\resources\\properties\\browser_url.properties");
			
		propertyFile=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+propertyFileName);
		}
		catch(FileNotFoundException e) {
			System.out.println("plz check the path"+e);
		}
		
		obj_Properties=new Properties();
		
		try {
			
		obj_Properties.load(propertyFile);
		
		}
		catch(IOException e) {
			System.out.println("plz check the path"+e);
		}
		
		return obj_Properties;
	}

}
