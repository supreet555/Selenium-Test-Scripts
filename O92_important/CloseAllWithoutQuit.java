package O0_important_test;

import java.util.Set;

import util.Help;

public class CloseAllWithoutQuit extends Help {

	public static void main(String[] args) throws InterruptedException {

		openBrowserNavigate("https://www.dummysoftware.com/popupdummy_testpage.html");
		Set<String> tabs = driver.getWindowHandles();
		for(String tab : tabs) {
			Thread.sleep(500);
			driver.switchTo().window(tab);
			driver.close();
		}
		
	}

}
