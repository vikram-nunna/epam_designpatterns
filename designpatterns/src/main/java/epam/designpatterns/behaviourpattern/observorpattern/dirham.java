package epam.designpatterns.behaviourpattern.observorpattern;

public class dirham {
	float dirhams;
	float rupee;
    public void update(float rupee)
    {
    	this.rupee=rupee;
        dirhams=rupee/(float) 78.40;
        display();
    }
    public void display()
    {
        System.out.println("The value of "+rupee+" Euro is "+dirhams);
    }

}
