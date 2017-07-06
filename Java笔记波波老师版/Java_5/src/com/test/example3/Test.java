package com.test.example3;

public class Test {
	
	public static void main(String[] args) {
		
		WoodDoor wd=new WoodDoor();
		IronDoor id=new IronDoor();
		AlarmDoor  ad=new AlarmDoor();
		
		testDoor(wd);
		testDoor(id);
		testDoor(ad);
	//	testDoor(car);  错误，testDoor方法，要求参数是Door
		
		
		Car  car=new Car();
		testCar(car);
		//testCar(wd);  错误，testCar方法，要求参数是Car
		
		
		testAlarm(ad);  //测试防盗门
		testAlarm(car);  //测试车
		
	
		
	}

	//测试门的开关功能的方法，方法参数是个Door
	//只要是Door的子类对象，都可以传入
	public static void testDoor(Door door){
		door.open_close();
	}
	
	//测试车的功能 ,方法参数是Car
	//只要是Car 或Car  的子类对象，都可以传入
	public static void testCar(Car car){
		 car.run();
	}
	
	//测试报警功能,参数是一个接口。
	//实现了该接口的类的对象都可以传入
	public static void testAlarm(Alarm alarm){
		
		alarm.alarm();
		
	}
	
	
	
	
}
