package using.setterInjection;

public class Car {
	private IEngine iEngine;
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
