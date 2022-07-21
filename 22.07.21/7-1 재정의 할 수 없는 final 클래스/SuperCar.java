package sec01.exam06;

public class SuperCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/*
	 * @Override public void stop() { System.out.println("스포츠카를 멈춤"); speed = 0; }
	 * -> 부모 메서드 final로 정의 = 상속 불가
	 */
	

	
}
