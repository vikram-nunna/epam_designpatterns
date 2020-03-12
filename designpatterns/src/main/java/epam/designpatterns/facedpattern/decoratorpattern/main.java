package epam.designpatterns.facedpattern.decoratorpattern;

public class main {
	public static void main(String[] args) {
		burger bb=new burger();
		toppings mushroomsDecorator=new mushroom(bb);
		System.out.println(mushroomsDecorator.getDiscription()+" cost = "+mushroomsDecorator.getburgercost());
		System.out.println(paneer.getDiscription()+" cost = "+paneer.getburgercost());
	}

}
