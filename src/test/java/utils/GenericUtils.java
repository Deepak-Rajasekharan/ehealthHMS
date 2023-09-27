package utils;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	private Random random;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
		random = new Random();
	}
	
	
	
	public void SwitchParentWindow()
	{
		
		Set<String> s1= driver.getWindowHandles();  //switch windows from parent to child
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		//String childWindow = i1.next();
		driver.switchTo().window(parentWindow);
		
	}

	public void SwitchChildWindow() {
		Set<String> s1= driver.getWindowHandles();  //switch windows from child to parent
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}
	
	public void acceptAlertIfPresent() {
        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }
	
	public String generateRandomName() {
        StringBuilder nameBuilder = new StringBuilder();
        int nameLength = random.nextInt(5) + 5; // Generate names with 5 to 9 characters
        
        for (int i = 0; i < nameLength; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a'); // Generate a random lowercase letter
            nameBuilder.append(randomChar);
        }
        
        return nameBuilder.toString();
	}

}
