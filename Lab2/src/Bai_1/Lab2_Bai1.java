package Bai_1;
import java.util.Scanner;
public class Lab2_Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.println("Nhập các hệ số của phương trình bậc nhất: ");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		if(a==0) {
			if(b==0) {
				System.out.print("Phương trình vô số nghiệm!");
			}else {
				System.out.print("Phương trình vô nghiệm!");
			}
		}
		else {
			x = -b/a;
			System.out.printf("Phương trình có nghiệm = %d",x);
		}

	}

}
