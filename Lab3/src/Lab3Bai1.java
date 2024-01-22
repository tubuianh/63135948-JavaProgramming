
import java.util.Scanner;
public class Lab3Bai1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so can ktr nguyen to: ");
		int a = scanner.nextInt();
		boolean ok = true;
		for(int i = 2; i < a-1; i++) {
			if(a % i == 0) {
				ok = false;
				break;
			}
				
		}
		if(ok == true) 
			System.out.printf("%d la so nguyen to",a);
		else
			System.out.printf("%d khong phai la so nguyen to",a);
	}

}
