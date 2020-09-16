package zuoye4;

public class Car extends Vehicles {
	private int seats;
	//显示调用父类构造方法
	public Car() {
		super.run();
		super.Vehicles("奔驰", "黑色");
	}
	
	//构造方法初始化成员变量
	public void setSeats(int seats) {
		this.seats = seats;
	}
	//显示小汽车的信息
	public void showCar() {
		super.showInfo();
		System.out.println("座位数："+this.seats);
	}
}
