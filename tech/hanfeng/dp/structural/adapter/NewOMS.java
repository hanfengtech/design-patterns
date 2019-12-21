package tech.hanfeng.dp.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class NewOMS {
  /* The new OMS accepts input in JSON format */
  List<Item> cart = new ArrayList<>();
  List<Payment> payments = new ArrayList<>();
  
  public void addToBasket(Item itemJson) {
	  cart.add(itemJson);
	  System.out.println(itemJson.getName() + " " + itemJson.getPrice());
  }
  
  public void pay(Payment paymentJson) {
	  payments.add(paymentJson);
	  paymentJson.pay();
  }
}
