
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Bai2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> danhSachHoTen = new ArrayList<>();
		int luaChon;

		do {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    nhap(danhSachHoTen, scanner);
                    break;
                case 2:
                    xuat(danhSachHoTen);
                    break;
                case 3:
                    ngauNhien(danhSachHoTen);
                    break;
                case 4:
                    sapXep(danhSachHoTen);
                    break;
                case 5:
                	timVaXoa(danhSachHoTen, scanner);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 6);
	}
	
	public static void nhap(ArrayList<String> danhSachHoTen, Scanner scanner) {
		System.out.println("Nhập danh sách họ và tên (nhập 'xong' để kết thúc):");
        String hoTen;
        do {
        	hoTen = scanner.nextLine();
        	if(!hoTen.equalsIgnoreCase("xong")) {
        		danhSachHoTen.add(hoTen);
        	}
        }while(!hoTen.equalsIgnoreCase("xong"));
	}
	
	public static void xuat(ArrayList<String> danhSachHoTen) {
		for(String hoTen : danhSachHoTen) {
			System.out.println(hoTen);
		}
	}
	
	public static void ngauNhien(ArrayList<String> danhSachHoTen) {
		System.out.println("Danh sách ngẫu nhiên:");
		ArrayList<String> danhSachNgauNhien = new ArrayList<>(danhSachHoTen);
		Collections.shuffle(danhSachNgauNhien);
		for(String hoTen : danhSachNgauNhien) {
			System.out.println(hoTen);
		}
	}
	
	public static void timVaXoa(ArrayList<String> danhSachHoTen, Scanner scanner) {
	    System.out.println("Nhập họ tên cần tìm và xóa:");
	    scanner.nextLine();
	    String hoTenCanTim = scanner.nextLine();
	    for (String hoTen : danhSachHoTen) {
	        if (hoTen.equalsIgnoreCase(hoTenCanTim)) {
	            danhSachHoTen.remove(hoTen);
	            System.out.println("Đã xóa " + hoTenCanTim + " khỏi danh sách.");
	            return;
	        }
	    }
	    System.out.println(hoTenCanTim + " không tồn tại trong danh sách.");
	}
	
	public static void sapXep(ArrayList<String> danhSachHoTen ){
		System.out.println("Danh sách sắp xếp:");
		ArrayList<String> danhSachSapXep = new ArrayList<>(danhSachHoTen);
		Collections.sort(danhSachSapXep);
		Collections.reverse(danhSachSapXep);
		for(String hoTen : danhSachSapXep) {
			System.out.println(hoTen);
		}
	}
}
