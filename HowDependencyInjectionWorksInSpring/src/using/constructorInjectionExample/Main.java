package using.constructorInjectionExample;


public class Main {
public static void main(String[] args) {
//	creating target obj
//	injecting dependent obj into the  target obj using target class constructor method
	
Car c=new Car(new PetrolEngine());
//when using both injection then setter injection will run 
c.setIEngine(new ElectricEngine());
c.drive();
}
}
