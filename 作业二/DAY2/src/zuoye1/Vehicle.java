package zuoye1;

public class Vehicle {
	private int speed;
	private int size;
	
	public void speedUp() {
		System.out.println("加速");
	}
	public void speedDown() {
		System.out.println("减速");
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void setSize(int size) {
		this.size = size;
	}
	public int getSpeed() {
		System.out.println("速度为："+speed+"km/h");
		return speed;
	}
	public int getSize() {
		System.out.println("体积为："+size+"立方米");
		return size;
	}
}
