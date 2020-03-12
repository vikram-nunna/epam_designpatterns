package epam.designpatterns.creationalpattern.singleton;

public class singleton {
	static singleton objectForSingletonClass=null;
	private singleton()
	{
		
	}
	public static singleton getObjectForSingletonClass()
	{
		if(objectForSingletonClass==null)
		{
			objectForSingletonClass=new singleton();
			System.out.println("object created");
			return objectForSingletonClass;
		}
		else
		{
			return objectForSingletonClass;
		}
	}

}
