package zuoye4;

public class Car extends Vehicles {
	private int seats;
	//��ʾ���ø��๹�췽��
	public Car() {
		super.run();
		super.Vehicles("����", "��ɫ");
	}
	
	//���췽����ʼ����Ա����
	public void setSeats(int seats) {
		this.seats = seats;
	}
	//��ʾС��������Ϣ
	public void showCar() {
		super.showInfo();
		System.out.println("��λ����"+this.seats);
	}
}
