// int型キューのテストプログラム

import java.util.Scanner;

class IntQueueTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64);

		while (true) {
			System.out.println("現在のデータ数：" + s.size() + "/" + s.capacity());
			System.out.print("(1)キュー　(2)デキュー　(3)ピーク　"
					+ "(4)ダンプ　(5)探索　(6)削除　(7)判定　(0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1:							// エンキュー
				System.out.print("データ：");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("キューが満杯です。");
				}
				break;
				
			case 2:							// デキュー
				try {
					x = s.deque();
					System.out.println("デキューしたデータは" + x + "です。");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
				}
				break;
				
			case 3:							// ピーク
				try {
					x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("キューが空です。");
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
				
			case 6:							// データの全削除
				s.clear();
				System.out.println("データを削除しました。");
				break;
				
			case 7:							// （空か満杯か）判定
				if(s.isEmpty())
					System.out.println("スタックは空です。");
				else if(s.isFull())
					System.out.println("スタックは満杯です。");
				else
					System.out.println("スタックに空きがあります。");
				break;
			}
			System.out.println();
		}
	}
}
