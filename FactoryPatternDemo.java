public class FactoryPatternDemo{
	public static void main(String[] args) {
		ShapeFactory sf1=new ShapeFactory();
		Shape s1=sf1.getShape("Circle");
		s1.draw();
		
	}
}

class ShapeFactory implements Shape{
	public Shape getShape(String shape){
		switch(shape){
			case"circle":
			  return new Circle();
			case"square":
			  return new Square();
			case"rectangle":
			  return new Rectangle();

		}
	}
}
