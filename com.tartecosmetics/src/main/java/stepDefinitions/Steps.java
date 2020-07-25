package stepDefinitions;

import com.ashutosh.test.Funtionality_Page;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends Base {
	
	Funtionality_Page functions;
	
	@Given("launch the url")
	public void launch_the_url() {
		
		launchBrowser();
	   
	}

	@Then("navigate to any category from Top Nav")
	public void navigate_to_any_category_from_Top_Nav() {
		
		Funtionality_Page functions = new Funtionality_Page(driver);
		functions.naviCategory();
	}

	@Then("add three products to the cart")
	public void add_three_products_to_the_cart() {
		
		Funtionality_Page functions = new Funtionality_Page(driver);
		functions.addProducts();
	   
	}

	@Then("go to bag page")
	public void go_to_bag_page() {
		
		Funtionality_Page functions = new Funtionality_Page(driver);
	    functions.goToBag();
	}

	@Then("delete any product")
	public void delete_any_product() {
		
		Funtionality_Page functions = new Funtionality_Page(driver);
		functions.removeAnItem("knockout pore refining set");
	}

	@Then("verify the product is removed")
	public void verify_the_product_is_removed() {
		Funtionality_Page functions = new Funtionality_Page(driver);
		functions.verifyItemRemoved();
	}




}
