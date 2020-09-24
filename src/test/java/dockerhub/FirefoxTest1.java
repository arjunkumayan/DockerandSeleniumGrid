package dockerhub;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest1 {

	@Test
public static void CleartripTest() {
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		
		URL url=null;
		try {
			url = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.getTitle());

	}

}
