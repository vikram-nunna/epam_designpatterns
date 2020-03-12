package epam.designpatterns.creationalpattern.factorypattern;

public class main {
	public static void main(String[] args) {
		factorydesign fo=new factorydesign();
		shape shapeObject=fo.getShape("Circle");
		shape shapeObject1=fo.getShape("Rectangle");
		shapeObject.draw();
		shapeObject1.draw();
	}

}
