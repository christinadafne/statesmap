package petdisesealert_testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import petdisesealert_Basecases.Pet_Basetestcases;

public class Pet_testcases extends Pet_Basetestcases {

	@Test(dataProvider="states")
	public void states(String name) throws Exception {
		openstate(name);

	}

	@DataProvider(name = "states")
	public Object[][] statename() {
		return new Object[][] { { "california" },{"florida"},{"new-york"},{"maryland"}};
	}
}
