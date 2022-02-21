package utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Properties;

public class FileUtils {
	
	
	public static String getProperty(String p) {
		String pv=null;
		try {
			FileInputStream fis = new FileInputStream("E:\\Projects\\cucumber\\src\\test\\java\\resources\\global.properties");
			Properties prop = new Properties();
			prop.load(fis);
			pv=prop.getProperty(p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return pv;
	}
	
	
	public static PrintStream getLogger() {
				Date dt = new Date();
				
				FileOutputStream fos;
				PrintStream pr=null;
				try {
					fos = new FileOutputStream(getProperty("logfilePath")+dt.getTime()+"_log.txt");
					 pr= new PrintStream(fos);
		
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return pr;
			}

}
