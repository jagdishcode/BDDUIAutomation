package com.test.bdd.pageobject;

import org.openqa.selenium.By;

public class HomePagePO {
	public By login = By.xpath("//a[@class='login']");
	public By email = By.id("email");
	public By pass = By.id("passwd");
	public By submit = By.id("SubmitLogin");

}
