package Bai_4;
import java.util.Scanner;
public class Lab2_Bai4 {
	public static void giaiPTB1() {
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
	
	public static void giaiPTB2() {
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
	
	public static void tinhTienDien() {
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
	
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("+----------------------------+\n");
		System.out.print("1. Giải PT bậc nhất!\n");
		System.out.print("2. Giải PT bậc hai!\n");
		System.out.print("3. Tính tiền điện!\n");
		System.out.print("4. Kết thúc!\n");
		System.out.print("+----------------------------+\n");
				
		System.out.print("Nhập lựa chọn: ");
		byte lc = scanner.nextByte();
		switch(lc) {
			case 1:{
				giaiPTB1();
				break;
			}
			case 2:{
				giaiPTB2();
				break;
			}
			case 3:{
				tinhTienDien();
				break;
			}
			case 4:{
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		menu();	
	}
}
