package whilee;

import java.util.Scanner;

public class rankova_probizhka {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int y = sc.nextInt();
		int d = 1;
		while (x < y) {
			x = x * 1.1;
			d += 1;
		}System.out.println(d);
			
		}
			
		

}
