package sinhvien;
import java.util.Scanner;


public class Sinhvien {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Nhap so luong sinh vien trong danh sach: ");
        System.out.println();
		int n=scan.nextInt();
		Person a[] = new Person [n+1];
		for (int i=1;i<=n;i++)
		{
			scan.nextLine();
			a[i] = new Person();
			System.out.print("Nhap Ten cua sinh vien: ");
			a[i].name=scan.nextLine();
			System.out.print("Nhap ma sinh vien: ");
			a[i].maSinhVien=scan.nextLine();
			System.out.print("Nhap tuoi cua sinh vien: ");
			a[i].age=scan.nextInt();
			System.out.print("Nhap chieu cao cua sinh vien: ");
			a[i].heigh=scan.nextDouble();
			System.out.println();
			System.out.print("Ban co muon nhap tiep hay khong? (Y/N): ");
			String s = scan.next();
			if (s.equals("N"))
			{
				n=i;
				break;
			}
			System.out.println();
		}
		for (int i=1;i<=n;i++)
		{
			System.out.println("Sinh vien: " + a[i].name);
			System.out.println("Ma sinh vien: " + a[i].maSinhVien);
			System.out.println("Age: " + a[i].age);
			System.out.println("Chieu cao: " + a[i].heigh);
			System.out.println();
		}
		scan.close();
	}
}
