package using.constructorInjectionExample;

public class Car {
	private IEngine iEngine;

//constructor injection
	public Car(IEngine iEngine) {
		this.iEngine = iEngine;
	}
	public Car()
	{
		
	}
	
//	setter injection
	public void setIEngine(IEngine iEngine) {
		this.iEngine=iEngine;
	}
	public void drive(){
		int start=iEngine.start();
		if (start>=1) {
			System.out.println("journey started");
		} else {
        System.out.println("failed to start journey");
		}
		
}

}
