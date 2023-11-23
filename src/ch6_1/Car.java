package ch6_1;

public class Car {

	int speed;//필드값은 초기화 하지 않으면 기본값 0으로 초기화
	
	public void printSpeed() {
		int carName;//이 변수는 필드가 아니다.-> 메서드 또는 생성자 내에서는 필드를 선언할 수 없다.
		//int self.carName;//필드 선언
		//int speed;//로컬 변수
		//this.speed = 10;
		speed = 10;
		System.out.println(speed);
	}
}
