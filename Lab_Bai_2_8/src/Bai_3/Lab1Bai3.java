package Bai_3;
import java.util.Scanner;
public class Lab1Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh của khối lập phương: ");
		int a = scanner.nextInt();
		int v = a*a*a;
		System.out.printf("Thể tích khối lập phương = %d",v);
	}
}
