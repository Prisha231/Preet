package StepDefination;

import org.openqa.selenium.By;

import com.BaseLayer.Baseclass;

import io.cucumber.java.en.When;

public class PersonalDetailsSteps extends Baseclass {
	
	@When("user enter {string} firstname and {string} lastname and {string} pincode")
	public void user_enter_firstname_and_lastname_and_pincode(String firstname, String lastname, String pincode)
			throws InterruptedException {

		driver.findElement(By.id("first-name")).sendKeys(firstname);
		driver.findElement(By.id("last-name")).sendKeys(lastname);
		driver.findElement(By.id("postal-code")).sendKeys(pincode);

		Thread.sleep(4000);
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {
		driver.findElement(By.id("continue")).click();

	}

	@When("user click on finish button")
	public void user_click_on_finish_button() {
		driver.findElement(By.id("finish")).click();

	}

}
