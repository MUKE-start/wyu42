package zuoye4;

public class Vehicles {
	private String brand;
	private String color;
	
	public void run() {
		System.out.println("我已经开动");
	}
	
	//构造方法
	public void Vehicles(String brand,String color) {
		this.brand = brand;
		this.color = color;
	}
	//显示所有信息
	public void showInfo() {
		System.out.println("品牌为："+this.brand);
		System.out.println("颜色为："+this.color);
	}
}
