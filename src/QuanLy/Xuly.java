package QuanLy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Xuly {

	Scanner sc = new Scanner(System.in);
	List<Employee> list_emp = new ArrayList<Employee>();
	List<Manager> list_mn = new ArrayList<Manager>();

	// Add nhan vien va quan ly
	public void addManagerEmplyee() {
		int luaChon; // bien local
		Object ps = null;
		boolean flag = true;
		while (flag) {
			System.out.println("Ban chon nhap:(1-Manager, 2-Employee): ");
			luaChon = sc.nextInt();
			sc.nextLine();

			switch (luaChon) {
			case 1:
				ps = new Manager();
				break;
			case 2:
				ps = new Employee(); 
				break;
			default:
				break;
			}
			Employee emp = new Employee();
			Manager mn = new Manager();
			if (ps instanceof Manager) {
				System.out.println("Ban chon nhap quan ly: ");
				mn.Add(sc);
				list_mn.add(mn);

			} else {
				System.out.println("Ban chon nhap nhan vien: ");

			
					System.out.print("Nhap vao id nguoi quan ly:");
					int id1 = sc.nextInt();
					emp.Add(sc);
					emp.Show();
					list_emp.add(emp);
					for (Manager mn1 : list_mn) {
						if (id1 == mn1.ID) {
							System.out.println("Ban dc quan ly boi: ");
							mn1.Show();
						}
					}
					
				System.out.println("Ban muon nhap tiep khong (Y/N)");
				String chon = sc.nextLine();
				if (chon.equals("N")) {
					flag = false;
					break;
				}
			}
		}
	}

	// In ra so nhan vien va quan ly trong cty
	public void statistical() {
		System.out.println("Tong so Employee : " + list_emp.size());
		System.out.println("Tong so manager: " + list_mn.size());
	}

	// Thong ke ds manager
	public void statiscalManager() {
		if (list_mn.size() > 0) {
			for (Manager mn : list_mn) {
				if (mn instanceof Manager)
					mn.Show();
			}
		}
	}

	// Tim kiem theo ID
	public void showID() {
		int id = sc.nextInt();
		sc.nextLine();
		for (Employee person : list_emp) {
			if (id == person.ID) {
				person.Show();
			} else {
				System.out.println("khong co thong tin can tim.");
			}
		}
	}
}
