package whilee;

import java.util.Scanner;

public class dviykovyi_logarifm {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		int i = 1;
		while (	i <= n) {
			i *= 2;
			k += 1;
		}
		System.out.println(k);
		
	}


}
