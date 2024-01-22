
import java.util.Scanner;
import java.util.Arrays;
public class Lab3Bai4 {

	public static void nhapSinhVien(String hoTen[], double diem[], int n ) {
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<n;i++) {
			System.out.printf("Nhap ten sinh vien thu %d: ",i+1);
			hoTen[i] = scanner.nextLine();
			System.out.printf("Nhap diem sinh vien thu %d: ",i+1);
			diem[i] = scanner.nextDouble();
			scanner.nextLine();
		}
	}
	public static String xepLoai(double diem) {
		 if (diem < 5) {
	            return "Yeu";
	        } else if (diem < 6.5) {
	            return "Trung binh";
	        } else if (diem < 7.5) {
	            return "Kha";
	        } else if (diem < 9) {
	            return "Gioi";
	        } else {
	            return "Xuat sac";
	        }
	 }
	 public static void xuatSinhVien(String[] hoTen, double[] diem, int n) {
		 for(int i=0;i<n;i++) {
			 System.out.printf("%d. Ho ten: %s - Diem: %.1f - Hoc Luc: %s\n",i+1,hoTen[i],diem[i],xepLoai(diem[i]));
		 }
	 }
	 
	 public static void sapXepTheoDiem(String[] hoTen, double[] diem, int n) {
		 for(int i=0;i<n-1;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(diem[i]>diem[j]) {
					 double tempDiem = diem[i];
					 diem[i] = diem[j];
					 diem[j] = tempDiem;
					 
					 String tempHoten = hoTen[i];
					 hoTen[i] = hoTen[j];
					 hoTen[j] = tempHoten;
				 }
			 }
		 }
	 }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		String hoTen[] = new String[n];
		double diem[] = new double[n];
		nhapSinhVien(hoTen,diem,n);
		System.out.println("\nDanh sach sinh vien: ");
		xuatSinhVien(hoTen,diem,n);
		sapXepTheoDiem(hoTen,diem,n);
		System.out.println("\nSinh vien xep theo diem:");		
		xuatSinhVien(hoTen,diem,n);
		
	}

}
