package using.inheritance;

public class Car  {
public void dirve() {
//	for drive we need start()
	Engine e=new Engine();
	int isStart=e.start();
	if(isStart>=1) {
		System.out.println("car started");
	}
}
}
