package using.setterInjection;

public class Main {
public static void main(String[] args) {
//	creating target obj
	Car c=new Car();
//	setter injection
//	injecting dependent obj into the  target obj using target class setter method
	c.setIEngine(new ElectricEngine());
	c.drive();
}
}
