package simpleClass_Tasks1;
// �������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ���� 
// ����������. �������� �����, ������� ������� ����� �������� ���� ����������, � �����, ������� ������� 
// ���������� �������� �� ���� ���� ����������.
import java.util.Scanner;

public class Test1 {
	private int attribute1,attribute2; 
	
	private void print() {
		System.out.println("�������� ������ ����������: " + attribute1);
		System.out.println("�������� ������ ����������: " + attribute2);
	}
	private void scan() {
		Scanner in = new Scanner(System.in);
		System.out.println("������� �������� ������ ����������: ");
		attribute1 = in.nextInt();
		System.out.println("������� �������� ������ ����������: ");
		attribute2 = in.nextInt();
		in.close();
	}
	private int summ() {
		return attribute1 + attribute2;
	}
	private int compaire() {
		if (attribute1 > attribute2)
			return attribute1;
		else 
			return attribute2;
	}
	public static void main(String[] args) {
		Test1 objectTest1 = new Test1();
		objectTest1.scan();
		objectTest1.print();
		System.out.println("����� ���������: " + objectTest1.summ());
		System.out.println("�������� ���������� ��������: " + objectTest1.compaire());
	}

}
