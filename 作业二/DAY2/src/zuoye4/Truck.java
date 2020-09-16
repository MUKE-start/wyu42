package zuoye4;

public class Truck extends Vehicles {
	private float load;
	
	//显示调用父类构造方法
	public Truck() {
		super.run();
		super.Vehicles("福特", "白色");
	}
	
	public void setLoad(float load) {
		this.load = load;
	}
	
	public void showTruck() {
		super.showInfo();
		System.out.println("限载："+this.load+"吨");
	}
}
