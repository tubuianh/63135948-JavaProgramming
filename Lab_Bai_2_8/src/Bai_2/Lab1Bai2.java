package Bai_2;

import java.util.Scanner;

public class Lab1Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài và chiều rộng HCN: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int p = (a+b)*2;
		int s = a*b;
		int c = Math.min(a, b);
		System.out.printf("Chu vi = %d, Diện tích = %d, Cạnh nhỏ nhất = %d",p,s,c);
	}
	

}
