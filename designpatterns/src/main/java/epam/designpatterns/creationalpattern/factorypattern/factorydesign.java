package epam.designpatterns.creationalpattern.factorypattern;

public class factorydesign {
	shape getShape(String sp)
	{
		if(sp=="triangle")
			return new triangle();
		if(sp=="square")
			return new square();
		return null;
	}

}
