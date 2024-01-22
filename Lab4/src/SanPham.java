import java.util.Scanner;
public class SanPham {
	String tenSanPham;
	double donGia;
	double giamGia;
	Scanner scanner = new Scanner(System.in);
	public void nhap() {
		System.out.print("Nhap ten san pham: ");
		tenSanPham = scanner.nextLine();
		System.out.print("Nhap don gia: ");
		donGia = scanner.nextDouble();
		System.out.print("Nhap giam gia: ");
		giamGia = scanner.nextDouble();
	}
	public void xuat() {
		System.out.printf("\nTen san pham: %s\nDon gia: %.1f\nGiam gia: %.1f\nThue nhap khau: %.1f\n\n",tenSanPham,donGia,giamGia,getThueNhapKhau());
	}
	public double getThueNhapKhau() {
		return donGia*0.1;
	}
	
}
