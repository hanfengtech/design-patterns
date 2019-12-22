package tech.hanfeng.dp.structural.bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.print("Draw Rectangle in ");
		color.applyColor();
	}

}
