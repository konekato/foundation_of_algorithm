/*
 * 単純交換ソート（アルゴリズムの改良：打ち切りの使用）
 * ソートが完了した時点でそれ以降の動作を打ち切る
 */
import java.util.Scanner;

class BubbleSort2 {
	
	//--- 配列の要素a[ind1]とa[ind2]の値を交換 ---//
	static void swap(int[] a, int ind1, int ind2) {
		int t = a[ind1];
		a[ind1] = a[ind2];
		a[ind2] = t;
	}
	
	//--- 単純交換ソート（第２版：交換回数による打ち切り） ---// 
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;						// パスの交換回数
			//--- ここからがパス ---//
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
			}
			//--- ここまでがパス ---//
			if (exchg == 0)						// 交換が行われなくなったら終了
				break;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("単純交換ソート（バブルソート）");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx);					// 配列xを単純交換ソート
		
		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}
