import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class file_upload_sample1 {

	public static void main(String[] args) throws IOException, Throwable {
		System.setProperty("webdriver.gecko.driver", "H:\\BowserDrivers\\april_drivers\\geckodriver_v0_15_0.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.cs.tut.fi/~jkorpela/forms/file.html");

		driver.findElement(By.xpath("html/body/form[1]/p[2]/input")).click();

		Thread.sleep(3000);
		ProcessBuilder p = new ProcessBuilder(System.getProperty("user.dir")+"\\auto_sample1.exe","Open");
		p.start();
		
	}

}
