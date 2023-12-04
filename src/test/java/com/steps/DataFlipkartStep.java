package com.steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class DataFlipkartStep {
	
	// Extend Report --
	// hooks -- 
	

	// Data Table
	@When("^user enterd all details$")
	public void user_enterd_all_details(DataTable data) {
		
		
		List< Map<String, String> > outerList =data.asMaps(String.class, String.class);
		

		for(Map<String, String> map :outerList)
		{
			String fnamevalue = map.get("fname");
			System.out.println(fnamevalue);
			
			String lnamevalue = map.get("lname");
			System.out.println(lnamevalue);
			
		}
		
		
		
		
		/*List<List<String>> list1 = data.raw();
		for (List<String> list2 : list1) {
			for (String s : list2) {
				System.out.println(s + " ");
			}
		}
*/
		
		
		
		
	}

}
