package handson2;

public class ShapeMaker {

	Shape shape;
	
	public void ShapeMaker()
	{
		
	}
	public void drawCircle()
	{
		shape = new Circle();
		shape.draw();
	}
	public void drawRectangle()
	{
		shape = new Rectangle();
		shape.draw();
	}
	
	public void drawSquare()
	{
		shape = new Square();
		shape.draw();
	}
}
