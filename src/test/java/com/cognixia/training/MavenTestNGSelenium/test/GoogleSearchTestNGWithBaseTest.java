package com.cognixia.training.MavenTestNGSelenium.test;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTestNGWithBaseTest extends TestNGBase{
	//beforetest
	//beforemethod
	//test- alphabatically order me run
	//
	//aftertest
	
	private List<WebElement> suggestionslist;
	
	//1. Searching Google
	@Test
	public void testGoogleSearch() throws InterruptedException {
		//Enter string in searchbox
		
		String searchstring = "Selenium";
		searchbox.sendKeys(searchstring);
		
		//Submit the search
		 waitForSuggestionsToLoad(searchstring.toLowerCase());
			
			searchbutton.click();
		waitForTitleToContain(searchstring);
		
		//Verify that the title of new page contains the searchstring
		String expected = searchstring + " - Google Search";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
	}
	
	
	//2. Suggestions List
	@Test
	public void testSuggestions() {
		
		String searchstring = "maven";
		searchbox.sendKeys(searchstring);
		
		//By is a class in Selenium. It is also called as Locator class
		By  e= By.xpath("//li[@data-view-type='1']//div");
		
		waitForTextToBePresentInElement(e, searchstring);
		
		suggestionslist = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
		
		suggestionslist.forEach(suggestion -> {
			Assert.assertTrue(suggestion.getText().contains(searchstring));
		});		
	}
	
	//3. Results Page
	@Test
	public void testResultsPage() {
		String searchstring = "iphone";
		
		searchbox.sendKeys(searchstring);
		
         waitForSuggestionsToLoad(searchstring.toLowerCase());
		
		searchbutton.click();
		
		String firstlink = driver.findElement(By.tagName("h3")).getText();
		
		Assert.assertTrue(firstlink.toLowerCase().contains(searchstring));
		
//		System.out.println("Inside Test testResultsPage");
//		
//		System.out.println("Requested by Nitin");
	}
}