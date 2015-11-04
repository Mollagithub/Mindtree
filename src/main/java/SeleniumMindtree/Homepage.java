package SeleniumMindtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends PageBase{
	private WebElement login=null;
	private WebElement tag=null;
	
	public Homepage(WebDriver driver) {
		super(driver);
		
	}
	
public WebElement loginlink(){
	login=driver.findElement(By.xpath("//*[@id='block-block-1']/div/p/a/img"));
	login.click();
	return login;
}
public WebElement Alltag(){
	tag=driver.findElement(By.xpath(".//*[@id='Header']//ul/li"));
	String text=tag.getText();
	System.out.println(text);
	tag.click();
	
	return tag;
}
	

}
