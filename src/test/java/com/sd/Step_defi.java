package com.sd;



import org.openqa.selenium.WebDriver;

import com.automation.runner.Test_Runner;

import com.cucumber_automation.Baseclasskalai;
import com.cucumber_automation.Page_object_manager1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defi extends Baseclasskalai {
public static WebDriver driver=Test_Runner.driver;
	
	public static  Page_object_manager1 pom=new Page_object_manager1 (driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl("http://automationpractice.com/index.php");
	}

	@When("^user Enter The signin button$")
	public void user_Enter_The_signin_button() throws Throwable {
		clickonElement(pom.get_instance_home().getSignin());
	}

	@When("^user Enter The Emailaddress in Email Textbox$")
	public void user_Enter_The_Emailaddress_in_Email_Textbox() throws Throwable {
		inputvalueelement(pom.get_instance_login().getemail(),"k.kalaiselvi.sep4@mail.com");
	}

	@When("^user Enter The Password in Password Textbox$")
	public void user_Enter_The_Password_in_Password_Textbox() throws Throwable {
		inputvalueelement(pom.get_instance_login().getPassword(),"123456");
	}

	@Then("^user Click On The SignIn Button And It Navigate To women purchase Page$")
	public void user_Click_On_The_SignIn_Button_And_It_Navigate_To_women_purchase_Page() throws Throwable {
		clickonElement(pom.get_instance_login().getsubmit());
	}

	@When("^user Select The womendress$")
	public void user_Select_The_womendress() throws Throwable {
		clickonElement(pom.get_instance_order().getWomen());
	}

	@When("^user Click the list icon(\\d+)$")
	public void user_Click_the_list_icon(int arg1) throws Throwable {
		clickonElement(pom.get_instance_order().getList());
	}
	@When("^user select the fadeddress$")
	public void user_select_the_fadeddress() throws Throwable {
		clickonElement(pom.get_instance_order().getfadeddress());
	}

	@When("^user Select The Quantity In Text Box$")
	public void user_Select_The_Quantity_In_Text_Box() throws Throwable {
		pom.get_instance_s().getQuantity().clear();
		inputvalueelement(pom.get_instance_s().getQuantity(), "3");
	}

	@When("^user Select The Size In checkbox$")
	public void user_Select_The_Size_In_checkbox() throws Throwable {
		dropdown("byvalue", pom.get_instance_s().getSize(), "3");
	}

	@When("^user click The addtocart(\\d+)$")
	public void user_click_The_addtocart(int arg1) throws Throwable {
		clickonElement(pom.get_instance_order().getaddcart());
	}

	@Then("^user Click the Signout(\\d+)$")
	public void user_Click_the_Signout(int arg1) throws Throwable {
		clickonElement(pom.get_instance_order().getsignout());
	}

	@When("^user Select The dresses$")
	public void user_Select_The_dresses() throws Throwable {
		clickonElement(pom.get_instance_drive().getdresses());
	}

	@When("^user select the dress purchase$")
	public void user_select_the_dress_purchase() throws Throwable {
		clickonElement(pom.get_instance_drive().getpurchaseorder());
	}
	@When("^user clickthe addtocart(\\d+)$")
	public void user_clickthe_addtocart(int arg1) throws Throwable {
		clickonElement(pom.get_instance_order().getaddcart());
	}

	@Then("^user click the Signout(\\d+)$")
	public void user_click_the_Signout(int arg1) throws Throwable {
		clickonElement(pom.get_instance_order().getsignout());
	}

	@When("^user Select The Tshirts$")
	public void user_Select_The_Tshirts() throws Throwable {
		clickonElement(pom.get_instance_drive().gettshirts());
	}

	@When("^user Click The list icon(\\d+)$")
	public void user_Click_The_list_icon(int arg1) throws Throwable {
		clickonElement(pom.get_instance_order().getList());
	}
	@When("^user select the tshirtspurchase$")
	public void user_select_the_tshirtspurchase() throws Throwable {
		clickonElement(pom.get_instance_drive().gettshirtsorder());
	}

	@When("^user click the addtocart(\\d+)$")
	public void user_click_the_addtocart(int arg1) throws Throwable {
		clickonElement(pom.get_instance_order().getaddcart());
	}

	@When("^user Click The Proceed to check(\\d+)$")
	public void user_Click_The_Proceed_to_check(int arg1) throws Throwable {
		clickonElement(pom.get_instance_s().getproccedcheck());
	}

	
	@When("^user Click The Radio Button for Termsofconditions$")
	public void user_Click_The_Radio_Button_for_Termsofconditions() throws Throwable {
		clickonElement(pom.get_instance_s().gettermsodconditions());
	}

	@When("^user Select The proceed to check(\\d+)$")
	public void user_Select_The_proceed_to_check(int arg1) throws Throwable {
		clickonElement(pom.get_instance_s().getproccedcheck4());
	}

	@When("^user click The paybycheck$")
	public void user_click_The_paybycheck() throws Throwable {
		clickonElement(pom.get_instance_s().getpaybycheck());
	}

	@When("^user Click The Confirm Order$")
	public void user_Click_The_Confirm_Order() throws Throwable {
		clickonElement(pom.get_instance_s().getconfirm());
	}

}
