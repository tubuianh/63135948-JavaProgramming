package Bai_3;
import java.util.Scanner;
public class Lab2_Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng: ");
		double soDien = scanner.nextDouble();
		double tien;
		if(soDien < 50) {
			tien = soDien*1000;
		}
		else {
			tien = 50*1000 + (soDien - 50)*1200;
		}
		System.out.printf("Số tiền điện: %.2f",tien);
	}
}
