package epam.designpatterns.facedpattern.decoratorpattern;

public class mushroom extends toppings{
	burger bobj;
	public mushroom(burger b)
	{
		this.bobj=b;
	}

	double getburgercost() {
		return 50.0+bobj.getburgercost();
	}

	String getDiscription() {
		return bobj.getDiscription()+" with  Mushrooms";
	}

}
