package SeleniumMindtree;

import org.openqa.selenium.WebDriver;


public class ApplicationPage {
	private WebDriver driver=null;

	private Homepage homepage = null; 
	public ApplicationPage(WebDriver driver) {
		this.driver = driver;
		}
	
	public Homepage homePage(){
		if(homepage == null){
			homepage = new Homepage(driver);
		}
		 return homepage;
	}
	
}
