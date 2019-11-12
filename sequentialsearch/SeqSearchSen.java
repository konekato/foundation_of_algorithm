import java.util.Scanner;
class SeqSearchSen {
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		while(true) {
			if(a[i] == key) {
				break;
			} else {
				i++;
			}
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("探す値：");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.println("線形探索失敗");
		} else {
			System.out.println("線形探索成功\n"
					+ "x[" + idx + "]");
		}
	}

}
