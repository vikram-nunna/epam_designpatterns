package epam.designpatterns.behaviourpattern.observorpattern;

public class currencyconverter {
	
	float rupee;
    dirham di;
    dollar d1;
    public currencyconverter(dirham di,dollar d1)
    {
        this.di=di;
        this.d1=d1;
    }
    public void ChangeCurrency(float d)
    {
    	this.rupee=d;
        di.update(d);
        d1.update(d);
    }

}
