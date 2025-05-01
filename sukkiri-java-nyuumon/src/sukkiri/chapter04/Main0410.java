package sukkiri.chapter04;

public class Main0410 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[1];
		}
		int ave = sum / scores.length;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + ave);
	}
}
