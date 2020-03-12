package epam.designpatterns.behaviourpattern.observorpattern;

public class dollar {

	float dollar;
	float rupee;
    public void update(float rupee)
    {
    	this.rupee=rupee;
        dollar=rupee/(float) 69.79;
        display();
    }
    public void display()
    {
        System.out.println("The value of "+rupee+" int Dollar is "+dollar);
    }
}
