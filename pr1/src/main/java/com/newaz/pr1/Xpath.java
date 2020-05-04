package com.newaz.pr1;

public class Xpath {

	public static void main(String[] args) {
		
		// how to write customize Xpath? 
		//1. //input[@type='submit']
		//2. //input[@type='submit' and @value='submit']
		//3. for link without contain:  //a[text()='Learn more']
		//4. for link with contain ;   //a[contains(text(),'Learn more')]
		//5. for button : //button[@type='submit' and @name='websubmit']
		//6. for alert : //a[text()='Alert']
		//7. //div[@class='dropdown']//button[@type ='button' and @class='xxxxx' and @id ='dropdownMenuButton']
		//8. //button[@id='dropdownMenuButton']
		//9. //a[(text()='bootstrap')]
		//10. Webtable particualr checkbox xapath: 
		      //a[text()='test2 test2']//parent::td[@class='datalistrow']//proceding-sibling::td[@class='datalistrow']//input[@name='contact_id']

	}

}
