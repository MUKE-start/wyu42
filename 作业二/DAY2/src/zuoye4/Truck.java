package zuoye4;

public class Truck extends Vehicles {
	private float load;
	
	//��ʾ���ø��๹�췽��
	public Truck() {
		super.run();
		super.Vehicles("����", "��ɫ");
	}
	
	public void setLoad(float load) {
		this.load = load;
	}
	
	public void showTruck() {
		super.showInfo();
		System.out.println("���أ�"+this.load+"��");
	}
}
