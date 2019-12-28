import java.util.Scanner;

class IntStackTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("現在のデータ数：" + s.size() + "/" + s.capacity());
			System.out.print("(1)プッシュ　(2)ポップ　(3)ピーク　(4)ダンプ　(5)探索　(6)判定　(7)削除　(0)終了：");
			
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:							// プッシュ
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("スタックが満杯です。");
				}
				break;
				
			case 2:							// ポップ
				try {
					x = s.pop();
					System.out.println("ポップしたデータは" + x + "です。");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;
				
			case 3:							// ピーク
				try {
					x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;
				
			case 4:							// ダンプ
				s.dump();
				break;
				
			case 5:							// 探索
				System.out.print("探す値：");
				x = stdIn.nextInt();
				if (s.indexOf(x) == -1)
					System.out.println("その値は存在しません。");
				else
					System.out.println("その値はインデックス" + s.indexOf(x) + "に存在します。");
				break;
				
			case 6:							// （空か満杯か）判定
				if(s.isEmpty())
					System.out.println("スタックは空です。");
				else if(s.isFull())
					System.out.println("スタックは満杯です。");
				else
					System.out.println("スタックに空きがあります。");
				break;
				
			case 7:
				s.clear();
				System.out.println("データを削除しました。");
				break;
			}
			System.out.println("");
		}
	}
}
