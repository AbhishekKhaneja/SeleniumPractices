package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectdropclass {

	public void dropdown(String param1, String param2, WebDriver driver) {

		WebElement A = driver.findElement(By.name(param1));

		Select obj = new Select(A);
		List<WebElement> L = obj.getOptions();
//Normal loop Ist way
//		for (int i = 0; i < L.size(); i++) {
//			System.out.println(L.get(i).getText());
//
//		}
//
//		for (int i = 0; i < L.size(); i++) {
//			if (L.get(i).getText().equals(param2))
//
//				L.get(i).click();
//		}

//Advance for loop 2nd way
		     for (WebElement Q : L) {
			System.out.println(Q.getText());

			if (Q.getText().equals(param2)) {
				Q.click();
			}

		}
	}
	
	public void radio(String paramter1,String parameter2,WebDriver driver){
		
		
	List<WebElement> J=	driver.findElements(By.name(paramter1));
	
	for(int j =0;j<J.size();j++)
	{
		if(J.get(j).getAttribute("value").equals(parameter2))
		{
			J.get(j).click();
		}
	}
		
		
		
		
		
		
	}

}
