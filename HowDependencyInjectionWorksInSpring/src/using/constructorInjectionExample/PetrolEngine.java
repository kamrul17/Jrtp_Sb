package using.constructorInjectionExample;

public class PetrolEngine implements IEngine {

	@Override
	public int start() {
	System.out.println("PetrolEngine");
		return 1;
	}

}
