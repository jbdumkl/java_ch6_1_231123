package ch6_1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//용어 숙지 필요
		
		Student stu1 = new Student();//Student 클래스로 객체가 선언
		
		//System.out.println(stu1.age);
		
		stu1.name = "홍길동";
		stu1.age = 10;
		
		Student stu2 = new Student();//Student 클래스로 객체가 선언
		
		stu1.name = "김유신";
		stu1.age = 20;
		Car car1 = new Car();
		System.out.println(car1.speed);
		car1.printSpeed();
		System.out.println(car1.speed);
	}

}
