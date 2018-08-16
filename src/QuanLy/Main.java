package QuanLy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		int luaChon;	
		Scanner sc = new Scanner(System.in);

		Xuly qlct = new Xuly();

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Them employee/manager");
			System.out.println("2. Thong ke so employee/manager");
			System.out.println("3. Thong ke danh sach manager");
			System.out.println("4. Hien thi employee theo ID");
			System.out.println("5. Thoat");
			luaChon = sc.nextInt();
			sc.nextLine();//bo enter

			switch (luaChon) {
			case 1:
				System.out.println("Ban chon chuc nang thu nhat.");
				qlct.addManagerEmplyee();
				break;
			case 2:
				System.out.println("Ban chon chuc nang thu hai.");
				qlct.statistical();
				break;
			case 3:
				System.out.println("Ban chon chuc nang thu ba.");
				qlct.statiscalManager();
				break;
			case 4:
				System.out.println("Ban chon chuc nang thu tu.");
				System.out.println("Nhap id cua nhan vien can hien thi: ");
				qlct.showID();
			default:
				System.out.println("Ket thuc!");
			}
			if (luaChon != 1 && luaChon != 2 && luaChon != 3 && luaChon != 4) {
				break;
			}		
		}		
	}
}