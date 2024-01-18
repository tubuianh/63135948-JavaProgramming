package Bai_2;
import java.util.Scanner;
public class Lab2_Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x;
		double delta;
		System.out.println("Nhập các hệ số của phương trình bậc hai: ");
		System.out.print("a = ");
		double a = scanner.nextDouble();
		System.out.print("b = ");
		double b = scanner.nextDouble();
		System.out.print("c = ");
		double c = scanner.nextInt();
		 if (a == 0) {
	            if (b == 0) {
	                System.out.print("Phương trình vô số nghiệm!");
	            } else {
	                System.out.print("Phương trình vô nghiệm!");
	            }
	        } else {
	            delta = Math.pow(b, 2) - 4 * a * c;
	            if (delta < 0) {
	                System.out.print("Phương trình vô nghiệm!");
	            } else if (delta == 0) {
	                x = -b / (2 * a);
	                System.out.printf("Phương trình có nghiệm kép = %.2f\n", x);
	            } else {
	                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	                System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.2f, x2 = %.2f\n", x1, x2);
	            }
	        }

	}
}
