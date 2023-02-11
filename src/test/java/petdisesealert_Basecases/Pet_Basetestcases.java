
package petdisesealert_Basecases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import petdisesealert_utils.Pet_Utils;

public class Pet_Basetestcases extends Pet_Utils{
	
	@BeforeMethod
	public void country()
	{
		browser("chrome");
	}
	
	@AfterMethod
	public void close() throws Exception
	{
		Thread.sleep(2000);
		driver.close();
	}

}
