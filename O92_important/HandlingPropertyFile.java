package O0_important_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import util.Help;

public class HandlingPropertyFile extends Help {

	public static void main(String[] args) throws IOException {

		String path = "./data/commondata.properties";
		FileInputStream fin = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fin);
		String url = p.getProperty("url");
		openBrowserNavigate(url);
		
	}

}
