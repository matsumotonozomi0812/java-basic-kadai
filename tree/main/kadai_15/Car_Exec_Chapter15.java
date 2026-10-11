package kadai_015; //パッケージ名を kadai_015 に変更

public class CarExec_Chapter15 { //クラス名から「_」を削除して CarExec_Chapter15 に修正

	public static void main(String[] args) {
		// Car_Chapter15のインスタンスを作成
		Car_Chapter15 car = new Car_Chapter15();
		
		// ギアを3に変更
		car.changeGear(3);
		
		// 速度を表示
		car.run();
	}

}
