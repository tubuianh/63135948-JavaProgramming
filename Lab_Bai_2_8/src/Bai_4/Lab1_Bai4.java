package Bai_4;
import java.util.Scanner;
public class Lab1_Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập các hệ số của phương trình bậc 2 (ax^2 + bx + c = 0): ");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.print("c = ");
		int c = scanner.nextInt();
		int delta = (int) (Math.pow(b, 2) - 4 * a * c);
		
		System.out.printf("Delta = %d\n",delta);
		System.out.printf("Căn bậc 2 của delta = %s ",Math.sqrt(delta));
	}

}
