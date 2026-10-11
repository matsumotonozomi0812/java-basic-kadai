package kadai_015; //パッケージ名を kadai_015 に変更

public class Car_Chapter15 {

	// ギア（1～5）
	private int gear;
	// スピード（時速）
	private int speed;

	// コントラクタ（初期化処理）
	public Car_Chapter15() {
		this.gear = 1;
		this.speed = 10;
	}

	// ギアを変更するメソッド
	public void changeGear(int afterGear) {
		//ギア変更時の表示を追加（変更前と変更後のギアが分かる形）
		System.out.println("ギアを" + this.gear + "から" + afterGear + "に切り替えました");
		
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

	// ギアチェンジ後の速度を表示するメソッド
	public void run() {
		// 課題の参考イメージ（速度の表示）に合わせた文言に修正
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
	//ここにあった不要な main メソッドは削除しました
}
