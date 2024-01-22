
import java.util.Scanner;
import java.util.Arrays;
public class Lab3Bai3 {

	public static void nhapMang(int a[], int n) {
		Scanner scanner = new Scanner(System.in);		
		for(int i=0;i<n;i++) {
			System.out.printf("a[%d] = ",i);
			a[i] = scanner.nextInt();
		}

	}
	
	public static void xuatMang(int a[], int n) {
		System.out.println("Mang vua nhap:");
		for(int i=0;i<n;i++) {
			System.out.printf("%d ",a[i]);
		}

	}
	public static int ptuBeNhat(int a[], int n) {
		int Min = a[0];
		for(int i=0;i<n;i++) {
			if(a[i] < Min)
				Min = Math.min(Min, a[i]);
		}
		return Min;
	} 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Nhap so luong phan tu: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		nhapMang(a,n);
		Arrays.sort(a);
		xuatMang(a,n);
		System.out.printf("\nPhan tu nho nhat: %d",ptuBeNhat(a,n));
		int count = 0;
		double tong = 0;
		for(int i=0;i<n;i++) {
			if(a[i] % 3 == 0) {
				tong += a[i];
				count++;
			}
		}
		System.out.printf("\nTrung binh cong cac phan tu chia het cho 3: %.2f",tong/count);
	}

}
