package epam.designpatterns.behaviourpattern.observorpattern;

public class main {
	public static void main(String[] args)
	{
	dirham di=new dirham();
	dollar d1=new dollar();
	currencyconverter object1=new currencyconverter(di,d1);
	object1.ChangeCurrency((float)120.0);
	}
}
