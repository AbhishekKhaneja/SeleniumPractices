package com.facebook.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class multipleexec {

	public void multiple(String P, String Q, WebDriver driver) {
		WebElement J = driver.findElement(By.id(P));

		Select mul = new Select(J);
		
		if(mul.isMultiple())
		{
		List<WebElement> M = mul.getOptions();

		for (int i = 0; i < M.size(); i++) {
			if (M.get(i).getText().equals(Q)|| M.get(i).getText().equals("Switch Commands")) {
				M.get(i).click();
			}
		}

	}
}
}
