package fortune;

public class Fortune {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの名前を教えてください");
		
		String name = new java.util.Scanner(System.in, "Shift-JIS").nextLine();
		
		System.out.println("こんにちは！" + name + "さん！");
		System.out.println("これからあなたの運勢を占います！");
		System.out.println("あなたの星座を教えてください！");
		
		String sign = new java.util.Scanner(System.in, "Shift-JIS").nextLine();
		
		System.out.println(sign + "ですね！" + "それでは占います・・・");
		
		int randomNumber = new java.util.Random().nextInt(12);
		
		switch(randomNumber) {
			case 0:
				System.out.println("本日のあなたの運勢は1位です！");
				System.out.println("素晴らしい一日になるでしょう！");
				break;
			case 1:
				System.out.println("本日のあなたの運勢は2位です！");
				System.out.println("とても良い一日になるでしょう！");
				break;
			case 2:
				System.out.println("本日のあなたの運勢は3位です！");
				System.out.println("とても良い一日になるでしょう！");
				break;
			case 3:
				System.out.println("本日のあなたの運勢は4位です！");
				System.out.println("まあまあの一日になるでしょう");
				break;
			case 4:
				System.out.println("本日のあなたの運勢は5位です！");
				System.out.println("まあまあの一日になるでしょう");
				break;
			case 5:
				System.out.println("本日のあなたの運勢は6位です！");
				System.out.println("まあまあの一日になるでしょう");
				break;
			case 6:
				System.out.println("本日のあなたの運勢は7位です！");
				System.out.println("いまいちな一日かもしれません・・・");
				break;
			case 7:
				System.out.println("本日のあなたの運勢は8位です！");
				System.out.println("いまいちな一日かもしれません・・・");
				break;
			case 8:
				System.out.println("本日のあなたの運勢は9位です！");
				System.out.println("いまいちな一日かもしれません・・・");
				break;
			case 9:
				System.out.println("本日のあなたの運勢は10位です！");
				System.out.println("運勢はあまりよくないですが、落ち込まないで！");
				break;
			case 10:
				System.out.println("本日のあなたの運勢は11位です！");
				System.out.println("運勢はあまりよくないですが、落ち込まないで！");
				break;
			case 11:
				System.out.println("本日のあなたの運勢は12位です！");
				System.out.println("そんな日もある・・・明日はきっと良いことあります！");
				break;
		}
		
		System.out.println("占いを終了します！");
	}

}
