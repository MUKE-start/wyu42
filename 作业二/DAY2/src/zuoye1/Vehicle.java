package zuoye1;

public class Vehicle {
	private int speed;
	private int size;
	
	public void speedUp() {
		System.out.println("����");
	}
	public void speedDown() {
		System.out.println("����");
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void setSize(int size) {
		this.size = size;
	}
	public int getSpeed() {
		System.out.println("�ٶ�Ϊ��"+speed+"km/h");
		return speed;
	}
	public int getSize() {
		System.out.println("���Ϊ��"+size+"������");
		return size;
	}
}
