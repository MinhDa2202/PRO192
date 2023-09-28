package congtrunhanchia;

import java.util.Scanner;

public class congtrunhanchia {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        float a,b;
		        do {
try {

		        System.out.print("Nhập số thứ nhất: ");
		         a = scanner.nextFloat();

		        System.out.print("Nhập số thứ hai: ");
		         b = scanner.nextFloat();

		        float C = a + b;
		        float T = a - b;
		        float N = a * b;
		        float CH =( a / b);

		        System.out.println("Kết quả cộng: " + C);
		        System.out.println("Kết quả trừ: " + T);
		        System.out.println("Kết quả nhân: " + N);
		        if(b==0) {
		        	System.out.println("b=0 nen k chia duoc: ");
		        }else {
		        	 System.out.println("Kết quả chia: " + CH);
		        }
		      return;
} catch (Exception e) {
	System.out.println("vui lòng nhập lại: ");
	
}
scanner.nextLine();
}while(true);
}
	}