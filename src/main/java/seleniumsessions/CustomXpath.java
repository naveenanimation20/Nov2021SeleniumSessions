package seleniumsessions;

public class CustomXpath {

	public static void main(String[] args) {

		//xpath: address of the element in HTML DOM
		//absolute xpath: /html/body/div[2]/div/div[1]/ul[3]/li[2]/a
		//relative xpath: custom xpath: functions, prop, xpath axes
		
		//htmltag[@attr='value']
		//input[@id='input-email']
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@id='input-email' and @name='email']
		//input[@id='input-email' or @name='email']
		
		//input[@type='submit' or @value='Login']
		
		//*[@attr='value']
		//*[@id='input-email']--300
		//input[@id='input-email']--10
		
		//input[@class='form-control'] - 2
		// (//input[@class='form-control'])[2]
		// (//input[@class='form-control'])[position()=2]
		// (//input[@class='form-control'])[last()]
		// ((//div[@class='navFooterVerticalRow navAccessibility']//ul)[4]//a)[last()]
		// ((//div[@class='navFooterVerticalRow navAccessibility']//ul)[last()]//a)[last()]
		
		//text():
		//htmltag[text()='value']
		//a[text()='Blog']
		//label[text()='First Name']
		//h1[text()='Register Account']
		
		//@attr and text():
		//htmltag[@attr='value' and text()='value' and @attr2='value']
		//a[@href and text()='login page']
		//label[@for='input-firstname' and text()='First Name']
		//label[text()='First Name' and @for='input-firstname']
		
		//contains() with attr:
		//htmltag[contains(@attr,'value')]
		//input[contains(@id,'firstname')]
		
		//input-firstname
		//123-firstname
		//456-firstname
		//input[contains(@id,'-firstname')]

		//contains() with attr1 and attr2 with no contains():
		//input[contains(@id,'firstname') and @name='firstname']
		//input[contains(@id,'firstname') and contains(@name,'firstname')]
		
		//contains() with text():
		//h2[contains(text(),'Accessories')]
		//p[contains(text(),'SaaS solutions')]
		//a[contains(text(),'Fresh')]
		
		//starts-with()
		//a[starts-with(text(),'Fresh')]
		//*[starts-with(text(),'Fresh')]
		
		//parent to child:
		//form[@id='Form_submitForm']//input -- 15 (direct + indirect child elements)
		//form[@id='Form_submitForm']/input --0 (direct)
		//div[@class='private-form__input-wrapper']//input[@id='username']
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		//select[@id='Form_submitForm_Country']/option
		//select[@id='Form_submitForm_Country']/child::option
		
		//select[@id='Form_submitForm_Country']/*
		
		//child to parent:
		//option[@value='Afghanistan']/..
		//option[@value='Afghanistan']/parent::select/parent::div
		//input[@id='Form_submitForm_Name']/ancestor::form[@id='Form_submitForm']
		//(//input[@id='Form_submitForm_Name']/ancestor::div)[last()]
		
		
		
	}

}
