package sec01.exam04;

public class SupersonicAirplane extends Airplane{
// 초음속 비행 모드 & 일반 비행(부모 상속)
	
//	상수
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
//		일반비행시 부모 메소드 호출 / 초음속 비행시 부모 메소드 재정의
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}
		else
			super.fly();
	}
	
	
	
	
}
