package tech.hanfeng.dp.structural.bridge;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.print("Draw Square in ");
		color.applyColor();
	}

}
