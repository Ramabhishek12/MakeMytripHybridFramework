package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public String getPropertyFileData(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilePath);
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
}
