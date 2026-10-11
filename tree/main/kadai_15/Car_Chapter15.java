package kadai_15;

public class Car_Chapter15 {

	//ギア
	private int gear;
	//スピー
	private int speed;

	public static void main(String[] args) {
	}
	public Car_Chapter15() {
		this.gear = 1;
		this.speed = 10;
	}
	public void changeGear(int afterGear) {
		this.gear = afterGear;
		this.speed = switch (gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
				
	}
	public void run () {
		System.out.println("この車は時速" + this.speed + "kmで走ります" );
	}
}
