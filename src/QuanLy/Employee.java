package QuanLy;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Employee extends KeThua {
	
	protected String PhongBan;
	protected String role;

	public Employee() {
		super();
	}
	
	public Employee(String PhongBan, String role) {
		this.setPhongBan(PhongBan);
		this.setRole(role);
	}
	public String getPhongBan() {
		return PhongBan;
	}
	public void setPhongBan(String PhongBan) {
		this.PhongBan = PhongBan;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Employee [PhongBan=" + PhongBan + ", role=" + role + ", ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE
				+ ", getPhongBan()=" + getPhongBan() + ", getRole()=" + getRole() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	void Add(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Nhap ID nhan vien: ");
		ID = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap vao Ten nhan vien: ");
		NAME = sc.nextLine();
		System.out.print("Nhap vao so tuoi: ");
		AGE = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap vao Phong ban(Production,Accounting,Sales) : ");
		PhongBan = sc.nextLine();
		System.out.print("Nhap vao role(saleEmployee,Deverlopper,Accounting): ");
		role = sc.nextLine();
	}

	void Show() {
		// TODO Auto-generated method stub
		System.out.println("Id: " + this.ID);
		System.out.println("Name: " + this.NAME);
		System.out.println("Age: " + this.AGE);
		System.out.println("Phong ban: " + this.PhongBan);
		System.out.println("Role: " + this.role);
	
	}
	
}


	
