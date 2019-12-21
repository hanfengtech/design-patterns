package tech.hanfeng.dp.structural.adapter;

import java.util.List;
import java.util.ArrayList;

public class LegacyOMS {
  /* Legacy OMS accepts input in XML format */

  List<Item> cart = new ArrayList<>();
  List<Payment> payments = new ArrayList<>();
  
  public void addItem(Item itemXml) {
	  cart.add(itemXml);
	  System.out.println(itemXml.getName() + " " + itemXml.getPrice());
  }
  
  public void makePayment(Payment paymentXml) {
	  payments.add(paymentXml);
	  paymentXml.pay();
  }
}
