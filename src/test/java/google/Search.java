package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
       
        
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Exefiles/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/?gfe_rd=cr&ei=w3s7U6DQJsSJ8QfDloEg");

         driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Wedding");
         Thread.sleep(3000);

        List<WebElement> lst=driver.findElements(By.xpath("//div[@class='aajZCb']/ul//li[@class='sbct' and @role='presentation']"));
         for(int i=0;i<lst.size();i++){
           
        	 System.out.println(lst.get(i).getText());
        	 
        	 
            
        }
         driver.quit();

    }

	}


