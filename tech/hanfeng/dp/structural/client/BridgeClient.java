package tech.hanfeng.dp.structural.client;

import tech.hanfeng.dp.structural.bridge.Circle;
import tech.hanfeng.dp.structural.bridge.Green;
import tech.hanfeng.dp.structural.bridge.Rectangle;
import tech.hanfeng.dp.structural.bridge.Red;
import tech.hanfeng.dp.structural.bridge.Shape;
import tech.hanfeng.dp.structural.bridge.Square;

public class BridgeClient {
	
  /*
   * @output
   * 
   * Draw Circle in Red
   * Draw Square in Red
   * Draw Rectangle in Green
   * 
   */
  public static void main(String[] args) {
	  Shape[] shapes = {
			  new Circle(new Red()),
			  new Square(new Red()),
			  new Rectangle(new Green())
	  };
	  
	  for (Shape shape : shapes) {
		  shape.draw();
	  }
  }
}
