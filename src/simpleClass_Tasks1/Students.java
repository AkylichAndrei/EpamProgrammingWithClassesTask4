// �������� ����� � ������ Student, ���������� ����: ������� � ��������, ����� ������, ������������ 
// (������ �� ���� ���������). �������� ������ �� ������ ��������� ������ ����. �������� ����������� 
// ������ ������� � ������� ����� ���������, ������� ������, ������ ������ 9 ��� 10.
package simpleClass_Tasks1;

import java.util.Scanner;

public class Students {
	private String firstName; // ���
	private String middleName;// ��������
	private String lastName;  // �������
	private long groupNumber;  // ����� ������
	public int[] academicPerformance = new int[5]; //������������
	
	Students(String fN, String mN, String lN, long gN) {
		
		this.setFirstName(fN);
		this.setMiddleName(mN);
		this.setLastName(lN);
		this.setGroupNumber(gN);
		
	
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(long groupNumber) {
		this.groupNumber = groupNumber;
	}
	
	
	public static void main(String[] args) {
	 Students[] stud = new Students[9];
	 String fN,mN,lN;
	 long gN;
	 int	sumAP = 0;
	 Scanner in = new Scanner(System.in);
	 for(int i = 0; i < stud.length; i++) {
		 
		System.out.println("������� Enter, ���� ������... ");
		in.nextLine();
		System.out.println("������� ��� ��������: ");
		fN = in.nextLine();
		System.out.println("������� �������� ��������: ");
		mN = in.nextLine();
		System.out.println("������� ������� ��������: ");
		lN = in.nextLine();
		System.out.println("������� ����� ������: ");
		gN = in.nextLong();
		stud[i] = new Students(fN,mN,lN,gN);
		for(int j = 0; j < 5; j++) {
			System.out.println("������� ������ �������� �����: " + (j+1));
			stud[i].academicPerformance[j]= in.nextInt();
		}
		
	 }
	 in.close();
	 
	 for(int j = 0; j< stud.length; j++) {
			for(int i = 0; i < 5; i++) {
			 	sumAP += stud[j].academicPerformance[i];
			}
			if(sumAP >= 45){
			System.out.println(" ===================================" );
			System.out.println(" ������ ������� ��������: " + stud[j].getLastName());
			System.out.println(" ����� ������ �������� ���������: " + stud[j].getGroupNumber());
			}
			sumAP =0;
			}
	 System.out.println(" ===================================" );
	  
	 }
		
}
	
	

