/*
 * 単純交換ソート（アルゴリズムの改良：ソート済みの省略）
 * 最後の交換位置から繰り返しを実行しソート済みは省略する
 */
import java.util.Scanner;

class BubbleSort3 {
	
	//--- 配列の要素a[ind1]とa[ind2]の値を交換 ---//
	static void swap(int[] a, int ind1, int ind2) {
		int t = a[ind1];
		a[ind1] = a[ind2];
		a[ind2] = t;
	}
	
	//--- 単純交換ソート（第３版：操作範囲を限定） ---// 
	static void bubbleSort(int[] a, int n) {
		int k = 0;								// s[k]より前はソート済み
		while (k < n - 1) {
			int last = n - 1;					// 最後に変換した位置
			for (int j = n - 1; j > k; j--)
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			k = last;
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
