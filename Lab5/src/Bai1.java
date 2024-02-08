import java.util.ArrayList;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList();
		System.out.println("Nhập danh sách số thực (nhập 'n' để kết thúc):");
		while(true) {
			Double x = scanner.nextDouble();
			list.add(x); 
			System.out.print("Nhập thêm (y/n)? ");
			scanner.nextLine();
			if(scanner.nextLine().equals("n")){
				break;
			}
		}
		for (double x : list){
			System.out.println(x);
		}
		double sum = 0;
		for (double x : list){
			sum += x;
		}
		System.out.println("Tổng: "+sum);
	}

}
