package simpleClass_Tasks1;

// ������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������. 
// �������� �����������, ���������������� ����� ������ �� ���������. �������� set- � get-
// ������ ��� ����� ���������� ������.
public class Test2 {
	 private int attribute1,attribute2;
	
	//����������� � �������� �����������.
	Test2(int attribute1, int attribute2){
		this.setAttribute1(attribute1);
		this.setAttribute2(attribute2);
		System.out.println("������� ����������� � �������� ����������� " + this.attribute1+" � " + this.attribute2);
	}
	//����������� �� ���������
	Test2(){
		System.out.println("������� ����������� �� ���������");
	}
	public int getAttribute2() {
		return attribute2;
	}
	public void setAttribute2(int attribute2) {
		this.attribute2 = attribute2;
	}
	public int getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(int attribute1) {
		this.attribute1 = attribute1;
	}
	public static void main(String[] args) {
		//������������� ����������� � �������� �����������.
		Test2 objTest2_1 = new Test2(1,2);
		Test2 objTest2_2 = new Test2();
		objTest2_1.attribute1=0;
		objTest2_2.attribute2=0;
	}
	

}
