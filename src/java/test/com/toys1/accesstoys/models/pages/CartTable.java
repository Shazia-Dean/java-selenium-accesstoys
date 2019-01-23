package com.toys1.accesstoys.models.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartTable {

	private WebElement tableElement;
	public CartTable(WebElement tableElement) {
		this.tableElement = tableElement;
	}

	By tableHeaders = By.cssSelector("thead th");
	By tableRows = By.cssSelector("tbody tr");
	By rowCells = By.tagName("td");
	By deleterow = By.className("remove-item");
	
	private int getColumnIndex(String columnName) throws Exception {
		List<WebElement> headers = tableElement.findElements(tableHeaders);
		for(int i=0; i < headers.size(); i++) {
			if(headers.get(i).getText().equals(columnName)) {
				return i;
			}
		}
		throw new Exception("Couldn't find column");
	}
	
	
	private WebElement getItemRow(String itemName) throws Exception{
		//find the column index of "Item"
		int itemIndex = getColumnIndex("Item");
		
		//get a list of the table rows
		List<WebElement> rows = tableElement.findElements(tableRows);
		
		//loop through the table rows
		for(WebElement row: rows) {
		//get a list of the table cells
			List<WebElement> cells = row.findElements(rowCells);
			
		//jump to the index of the item column using .get

		//check if the text = itemName
			if(cells.get(itemIndex).getText().equals(itemName)) {
		//return the row element
				return row ;
			}
				
		} throw new Exception("item not found");
	}
	
	public void setItemQuantity(String itemName, String quantity) throws Exception {
		//find the index of the quantity column
		int colIndex = getColumnIndex("quantityColumn");
		//get the row that contains the itemName
		WebElement rowIndex = getItemRow("item");
		//get a list of table cells for the returned row
		List<WebElement> rows = tableElement.findElements(tableRows);
		for(WebElement row: rows) {
		List<WebElement> cell = row.findElements(rowCells);
		
		//jump to the index location in that list for the quantity column and find element for the input box
		 	if(cell.get(colIndex).getText().equals(quantity)) {
		//clear the box
		 		cell.clear();
		//send keys
		 		tableElement.findElement(rowCells).sendKeys("3");;
	}
	}	
	}
	
	public void getSubTotalOfSmileyFace() {
			
			
		}
	//delete row
	public void ClickDeleteRowButton(String itemName) throws Exception {
			//find the index of the action column
		int actionCol =  getColumnIndex("index");
			//get the row that contains the itemName
		WebElement rowIndex = getItemRow("item");
			//get a list of table cells for the returned row
		List<WebElement> rows = tableElement.findElements(tableRows);
		for(WebElement row: rows) {
		List<WebElement> cell = row.findElements(rowCells);
			//jump to the index location in that list for the action column and find element for button
		 if(cell.get(actionCol).getText().equals(itemName)) {
			//click the button
			 tableElement.findElement(deleterow).click();
	}
	
	

		
		
		
}

