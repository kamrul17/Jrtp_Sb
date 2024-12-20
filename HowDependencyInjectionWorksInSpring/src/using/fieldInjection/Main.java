package using.fieldInjection;

import java.lang.reflect.Field;

public class Main {
public static void main(String[] args) throws Exception {
	
//	we can access private field by using reflection api
//	injecting dependent obj into the  target obj by using target class variable directly
	Class<?>clz=Class.forName("using.fieldInjection.Car");

	@SuppressWarnings("deprecation")
	Object obj=clz.newInstance();
	Car car=(Car)obj;
	
	Field engField=clz.getDeclaredField("iEngine");
	engField.setAccessible(true);
	engField.set(obj, new PetrolEngine());
	
	car.drive();
	}
}
