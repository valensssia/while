package whilee;

import java.util.Scanner;

public class chysla_fibonachi {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f1 = 1;
		int f2 = 1;
		int fs = 0;
		int i = 0;
		while (i < n - 2) {
			fs = f1 + f2;
			f1 = f2;
			f2 = fs;
			i = i + 1;
		}
		System.out.println(f2);
			
		}
			
		

}
