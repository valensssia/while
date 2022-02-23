package whilee;

import java.util.Scanner;

public class bankivski_vidsotky {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int p = sc.nextInt();
		int y = sc.nextInt();
		int d = 0;
		while (x <= y) {
			x = (x * (100 + p) / 100);
			d += 1;
		}System.out.println(d);
			
		}
			
		

}
