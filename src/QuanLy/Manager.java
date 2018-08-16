package QuanLy;

import java.util.Scanner;

public class Manager extends KeThua {
	protected int soEmployee;
	public Manager() {
		
	}
	public Manager(int soEmployee) {
		this.soEmployee = soEmployee;
	}
	public int getSoEmployee() {
		return soEmployee;
	}
	public void setSoEmployee(int soEmployee) {
		this.soEmployee = soEmployee;
	}
	
	void Add(Scanner sc) {
		System.out.print("Nhap ID manager: ");
		ID = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap vao Ten manager: ");
		NAME = sc.nextLine();
		System.out.print("Nhap vao so tuoi: ");
		AGE = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap so nhan vien can quan ly");
		soEmployee = sc.nextInt();
		
		}
	
	void Show() {
		System.out.println(this.NAME + "- tuoi: "+ this.AGE +" - Quanly "+ this.soEmployee+" nhan vien.");
	}
	
}
