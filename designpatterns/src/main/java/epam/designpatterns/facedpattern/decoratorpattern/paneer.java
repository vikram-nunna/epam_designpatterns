package epam.designpatterns.facedpattern.decoratorpattern;

public class paneer extends toppings {
	burger bobj;
	public paneer(burger bb)
	{
		this.bobj=bb;
	}
	@Override
	double getburgercost() {
		return 40.0+bobj.getburgercost();
	}
	@Override
	String getDiscription() {
		return bobj.getDiscription()+" with Panner ";
	}
}