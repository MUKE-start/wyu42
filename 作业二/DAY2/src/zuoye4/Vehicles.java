package zuoye4;

public class Vehicles {
	private String brand;
	private String color;
	
	public void run() {
		System.out.println("���Ѿ�����");
	}
	
	//���췽��
	public void Vehicles(String brand,String color) {
		this.brand = brand;
		this.color = color;
	}
	//��ʾ������Ϣ
	public void showInfo() {
		System.out.println("Ʒ��Ϊ��"+this.brand);
		System.out.println("��ɫΪ��"+this.color);
	}
}
