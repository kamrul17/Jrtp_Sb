package using.composition;

public class Car extends Engine {
public void dirve() {
//	for drive we need start()
	int isStart=start();
	if(isStart>=1) {
		System.out.println("car started");
	}
}
}
