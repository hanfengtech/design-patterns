package tech.hanfeng.dp.structural.client;

import tech.hanfeng.dp.structural.adapter.Item;
import tech.hanfeng.dp.structural.adapter.LegacyOMS;
import tech.hanfeng.dp.structural.adapter.OMSAdapter;
import tech.hanfeng.dp.structural.adapter.Payment;

public class AdapterClient {
	
	
	/*
	 *  @output  LegacyOMS
	 * 
	 *  Italian Pizza 6.99
	 *  Wine 9.99
	 *  Beer 5.99
	 *  Red Apple 1.49
	 *  Almonds 11.99
	 *  -----------------------------------
	 *  CASH $20.0
	 *  CREATE $10.0
	 *  DEBIT $10.0
	 *  -----------------------------------
	 *  
	 *  @output  Swap to use OMSAdapter
	 *  
	 *  Converted from XML to JSON
	 *  Italian Pizza 6.99
	 *  Converted from XML to JSON
	 *  Wine 9.99
	 *  Converted from XML to JSON
	 *  Beer 5.99
	 *  Converted from XML to JSON
	 *  Red Apple 1.49
	 *  Converted from XML to JSON
	 *  Almonds 11.99
	 *  -----------------------------------
	 *  Converted from XML to JSON
	 *  CASH $20.0
	 *  Converted from XML to JSON
	 *  CREATE $10.0
	 *  Converted from XML to JSON
	 *  DEBIT $10.0
	 *  -----------------------------------
	 *  
	 */
	
	public static void main(String[] args) {
		/* Create an order and add items */
		
	    // LegacyOMS oms = new LegacyOMS();
		
	    OMSAdapter oms = new OMSAdapter();
		
		oms.addItem(new Item("Italian Pizza", 6.99));
		oms.addItem(new Item("Wine", 9.99));
		oms.addItem(new Item("Beer", 5.99));
		oms.addItem(new Item("Red Apple", 1.49));
		oms.addItem(new Item("Almonds", 11.99));
		
		System.out.println("-----------------------------------");
		
		/* Create payment add make payment */
		oms.makePayment(new Payment("CASH", 20.00));
		oms.makePayment(new Payment("CREATE", 10.00));
		oms.makePayment(new Payment("DEBIT", 10.00));
		
		System.out.println("-----------------------------------");
	}

}
