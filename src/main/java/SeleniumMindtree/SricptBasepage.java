package SeleniumMindtree;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SricptBasepage {

	protected WebDriver driver=null;
	protected ApplicationPage MindTree=null;
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://www.mindtree.com/");
		
		
	}
	public ApplicationPage Mindtree (){
		if(MindTree == null){
			MindTree = new ApplicationPage(driver);
		}
		return MindTree;
		
	}
		 
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}
	




}
