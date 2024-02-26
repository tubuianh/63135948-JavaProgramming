import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SanPham {
    String ten;
    double donGia;

    public SanPham(String ten, double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Tên: " + ten + ", Giá: " + donGia;
    }
}
public class Bai3 {

	public static void main(String[] args) {
		 List<SanPham> danhSachSanPham = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("------ MENU ------");
	            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
	            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
	            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
	            System.out.println("4. Xuất giá trung bình của các sản phẩm");
	            System.out.println("0. Thoát chương trình");
	            System.out.print("Chọn một chức năng: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    nhapDanhSachSanPham(scanner, danhSachSanPham);
	                    break;
	                case 2:
	                    sapXepVaXuatSanPham(danhSachSanPham);
	                    break;
	                case 3:
	                    timVaXoaSanPham(scanner, danhSachSanPham);
	                    break;
	                case 4:
	                    tinhGiaTrungBinh(danhSachSanPham);
	                    break;
	                case 0:
	                    System.out.println("Đã thoát chương trình.");
	                    return;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ.");
	            }

	            System.out.println(); 
	        }
	    }

	    private static void nhapDanhSachSanPham(Scanner scanner, List<SanPham> danhSachSanPham) {
	        System.out.print("Nhập số lượng sản phẩm: ");
	        int soLuong = scanner.nextInt();
	        scanner.nextLine(); 

	        for (int i = 0; i < soLuong; i++) {
	            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
	            System.out.print("Tên: ");
	            String ten = scanner.nextLine();
	            System.out.print("Giá: ");
	            double gia = scanner.nextDouble();
	            scanner.nextLine(); 

	            SanPham sanPham = new SanPham(ten, gia);
	            danhSachSanPham.add(sanPham);
	        }

	        System.out.println("Nhập danh sách sản phẩm thành công.");
	    }

	    private static void sapXepVaXuatSanPham(List<SanPham> danhSachSanPham) {
	        if (danhSachSanPham.isEmpty()) {
	            System.out.println("Danh sách sản phẩm rỗng.");
	            return;
	        }

	        Comparator<SanPham> comp = new Comparator<SanPham>() {
	            @Override
	            public int compare(SanPham o1, SanPham o2) {
	                return Double.compare(o2.donGia, o1.donGia);
	            }
	        };

	        Collections.sort(danhSachSanPham, comp);

	        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
	        for (SanPham sanPham : danhSachSanPham) {
	            System.out.println(sanPham);
	        }
	    }

	    private static void timVaXoaSanPham(Scanner scanner, List<SanPham> danhSachSanPham) {
	        if (danhSachSanPham.isEmpty()) {
	            System.out.println("Danh sách sản phẩm rỗng.");
	            return;
	        }

	        System.out.print("Nhập tên sản phẩm cần tìm và xóa: ");
	        String tenSanPham = scanner.nextLine();

	        boolean timThay = false;
	        for (SanPham sanPham : danhSachSanPham) {
	            if (sanPham.ten.equalsIgnoreCase(tenSanPham)) {
	                danhSachSanPham.remove(sanPham);
	                timThay = true;
	                break;
	            }
	        }

	        if (timThay) {
	            System.out.println("Đã xóa sản phẩm " + tenSanPham);
	        } else {
	            System.out.println("Không tìm thấy sản phẩm " + tenSanPham);
	        }
	    }

	    private static void tinhGiaTrungBinh(List<SanPham> danhSachSanPham) {
	        if (danhSachSanPham.isEmpty()) {
	            System.out.println("Danh sách sản phẩm rỗng.");
	            return;
	        }

	        double tongGia = 0;
	        for (SanPham sanPham : danhSachSanPham) {
	            tongGia += sanPham.donGia;
	        }

	        double giaTrungBinh = tongGia / danhSachSanPham.size();
	        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
	    }

}
