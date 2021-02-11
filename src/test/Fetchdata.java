package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Fetchdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\saite\\eclipse-workspace\\TestngTutorial\\src\\test\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("C:\\Users\\saite\\eclipse-workspace\\TestngTutorial\\src\\test\\data.properties");
		prop.store(fos, null);
		prop.setProperty("url", "api.com");
		prop.store(fos, null);

	}

}
