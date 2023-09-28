package diem;

import java.util.Scanner;

public class diem {
public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập điểm chuyên cần: ");
	        float diemChuyenCan = scanner.nextFloat();

	        System.out.print("Nhập điểm giữa kì: ");
	        float diemGiuaKi = scanner.nextFloat();

	        System.out.print("Nhập điểm cuối kì: ");
	        float diemCuoiKi = scanner.nextFloat();
	        
	        float diemHocPhan = diemChuyenCan * 0.1f + diemGiuaKi * 0.2f + diemCuoiKi * 0.7f;

	        System.out.println("Điểm học phần: " + diemHocPhan);

	        scanner.close();
	    }
}
