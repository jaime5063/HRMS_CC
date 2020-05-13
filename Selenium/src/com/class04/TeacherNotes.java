package com.class04;

public class TeacherNotes {
	
/*Recap:
clear(); 
will clear the text from a textbox/text area.
isDisplayed(); 
to make sure if the targeted element is present on the UI or not.
submit(); 
if you have a form to submit, then use submit() method. if this cause a new page to load, then it will wait for the new page to display.
getText(); 
it is used to get the visibale text from the UI.
getAttribute(String att);
this method will return the value of any targetted attribute.
findElements();
1.this method will return a list of WebElements.
2.on zero match, it will return an empty list.
3.and it will not throw NoSuchElementException.
4.on one match, it will return one element as a list.
isEnabled(); boolean
This determines if the element currently is Enabled or not?
isSelected(); boolean
We use isSelected(); with checkbox and radio buttons to see if it selected or not.
Radio Button.
 an icon representing one of a set of options, which only can be selected at any time. There is no way to select two radio buttons at the same time. 
Operations on Radio Button:
Check the Existence of the Radio Button
Check Enabled Status  of the Radio Button
Check the Selected Status of the Radio Button
click
driver.findElement(By.id("btn_basic_example")).click();
    driver.findElement(By.linkText("Radio Buttons Demo")).submit();
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='optradio']"));
        if(!radioBtns.isEmpty()) {
            //Loop through all radio buttons
            for (int i = 0; i < radioBtns.size(); i++) {
            String text=radioBtns.get(i).getAttribute("value");
                
                if(text.equals("Female")) {
                    //Click only if the value equals to "Female"
                    radioBtns.get(i).click();
                    break;
                }
            }
        }else {
            System.err.println("List is empty, Check the xpath");
        }
Checkbox.
Checkbox same operation we do on checkbox that we did on radio button.
Checkbox allow you to select more than one element on the UI.
driver.findElement(By.id("btn_basic_example")).click();
driver.findElement(By.xpath("//a[text()='Check Box Demo']")).click();
List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement checkBox: checkBoxes) {
            checkBox.click();
            Thread.sleep(1000);
        }
Drop-Downs
a dropdown is a predefined list of options that a user can select from.
Operations on Drop down Box
Check the Existence of the Drop down Box
Check Enabled Status  of the Drop down Box
Select an Item
Return Items Count
Example:
driver.findElement(By.id("btn_basic_example")).click();
driver.findElement(By.xpath("//div[@id='basic']//div//a[4]")).click();
        
WebElement daysDD=driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);
        select.selectByValue("Monday");
        System.out.println(select.isMultiple());
        List <WebElement> list=select.getOptions();
        System.out.println(list.size());
        for (WebElement webElement : list) {
            String ele=webElement.getText();
            if(ele.equals("Friday")) {
                webElement.click();
            }
        }
Select Item - We can select a drop down values using 3 methods
selectByVisibleText
Visible text is the text between Option open tag and close tag
WebElement monthDD=driver.findElement(By.id("month"));
Select monthSelect=new Select(monthDD);
monthSelect.selectByVisibleText("August");
selectByValue
Value attribute will be given for option tags. you can get the value of value attribute.
monthSelect.selectByValue("1");
selectByIndex
If we have to select a random value from the list we can use select by index.
monthSelect.selectByIndex(0);
Note: Select class will work only with tag that starts with Select tag. If there is not select tag, We can handle those lists using click operation
FYI: We can use the same code to select multiple items if the list is multi select.
MultiSelect DropDown.
MultiSelect Dropdown is a textbox control that allows the user to  select multiple values from a list of predefined options.
getOptions();
This method will give you all of the options available in the dropdow and you can perforem getText(), click() operattions.
    Select select=new Select(element);
        List<WebElement> options=select.getOptions();
        for (WebElement option: options) {
            if (option.getText().equals(text)) {
                select.selectByVisibleText(text);
            }
        }
 * 	
 */

}
