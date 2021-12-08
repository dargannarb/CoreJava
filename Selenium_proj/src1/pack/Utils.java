package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utils {
	
	public HashMap<String, String> readDataFromPropFile(String path) throws IOException {
		HashMap<String, String> data = new HashMap<>();
		FileInputStream fis = new FileInputStream(path);
		Properties props = new Properties();
		props.load(fis);
		Set<Object> keys = props.keySet();
		for (Object key : keys) {
		   data.put(key.toString(), props.get(key).toString());
		}
		return data;
	}
	public String[][] readDataFromPropFileToArray(String path) throws IOException {
		String data[][];
		FileInputStream fis = new FileInputStream(path);
		Properties props = new Properties();
		props.load(fis);
		Set<Object> keys = props.keySet();
		data=new String[keys.size()][keys.size()];
		return data;
	}
	
	public static void takeScreenShotOfWebPage(String screenShotName)  {
		TakesScreenshot tss=(TakesScreenshot)Driver.driver;
		File screenShot =  tss.getScreenshotAs(OutputType.FILE);// byets / base64 /file
		String filePath="ScreeShots"+ File.separator +screenShotName+".jpeg";//   File.separator="//"
		File file=new File(filePath);
		try {
			FileUtils.moveFile(screenShot, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
