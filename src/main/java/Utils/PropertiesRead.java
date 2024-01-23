package Utils;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class PropertiesRead {


	private static Properties prop;

	public PropertiesRead() {
		try {
			Reader file = new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\Config\\Config.properties");
			prop = new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public  String readProperty(String key) {
		return prop.getProperty(key);
	}
	
}


