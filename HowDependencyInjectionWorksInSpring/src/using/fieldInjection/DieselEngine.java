package using.fieldInjection;

public class DieselEngine  implements IEngine{

	@Override
	public int start() {
	System.out.println("DieselEngine");
		return 1;
	}
	
}
