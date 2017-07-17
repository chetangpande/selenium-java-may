import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class File_Upload_SendKeys_Sample1 {

	public static void main(String[] args) {
		//FF driver
		WebDriver driver =null;
		System.setProperty("webdriver.gecko.driver", "H:\\BowserDrivers\\geckodriver.exe");		
		driver =new FirefoxDriver();
		driver.get("https://www.cs.tut.fi/~jkorpela/forms/file.html");
		
		//
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("/html/body/form[1]/p[2]/input")).sendKeys("H:\\file_upload_test_3003.txt");
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
