package O91_data_driven_testing;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Testing the application with multiple data that got from an external source. 
 * Data should not be hard coded.
 * We can get the stream of bytes from the file with FileInputStream, but retrieving the value with key is not possible here.
 * So we make use of load() method of Properties class.
 * And use getProperty(String key) to get the value.
*/


public class HandlingPropertyFile {
	public static void main(String[] args) throws IOException {

		String path = "./data/commondata.properties";
		FileInputStream fin = new FileInputStream(path);
		
		Properties p = new Properties(); // load(), getProperty()
		p.load(fin);
		
		String url = p.getProperty("url");
		String un = p.getProperty("un");
		String pwd = p.getProperty("pwd");
		
		System.out.println(url+"\n"+un+"\n"+pwd);

	}
}