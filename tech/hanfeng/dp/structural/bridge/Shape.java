package tech.hanfeng.dp.structural.bridge;

public abstract class Shape {
   protected Color color;
   
   public Shape(Color c) {
	   color = c;
   }
   
   public abstract void draw();
}
