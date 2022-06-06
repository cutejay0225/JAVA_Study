class Car{
	String color;
	String size;
	boolean engineState;
	void showAtts() { // 속성(상태)를 알려주는 메서드 정의
		System.out.println("This car is a " + color + " " + size + ".");
		if (engineState == true) {
			System.out.println("The engine is on.");
		}
		else {
			System.out.println("The engine is off");
		}
	}
	
	void startEngine() {
		if(engineState==true) {
			System.out.println("The engine is already on. \n");
			
		}
		else {
			System.out.println("The engine was started. \n");
		}
	}
	void stopEngine() {
		if (engineState==false) {
			System.out.println("The engine is aleady off. \n");
		}
		else {
			
			System.out.println("The engine was stopped. \n");
		}
	}

public static void main(String[] args) {
	Car myCar = new Car();
	myCar.color = "White";
	myCar.size = "compact";
	myCar.showAtts();
	myCar.startEngine();
	myCar.showAtts();
	myCar.stopEngine();
	
}
}


