package simpleClass_Tasks1;

import java.util.Scanner;

public class Counter1 {
	private int upperValue;
	private int lowerValue;
	private int presentValue;
	Counter1(){
		
	}
	Counter1(int uV, int pV, int lV){
		setUpperValue(uV);
		setPresentValue(pV);
		setLowerValue(lV);
	}
	private void increment() {
		if(getPresentValue()<getUpperValue()) {
		setPresentValue(getPresentValue()+1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if(getPresentValue()==getUpperValue())
			System.out.println("�� �������� ������� �������� ���������� ");
	}
	private void decrement() {
		if(getPresentValue()>getLowerValue()) {
			setPresentValue(getPresentValue()-1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			else if(getPresentValue()==getLowerValue())
				System.out.println("�� �������� ������� �������� ���������� ");
	}
	private int pV() {
		return getPresentValue();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uV,pV,lV;
		Counter1 objectCounter = new Counter1();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������� ������� ���������: ");
		uV = in.nextInt();
		System.out.println("������� ������ ������� ���������: ");
		lV = in.nextInt();
		System.out.println("������� ������� ���������: ");
		pV = in.nextInt();
		in.close();
		objectCounter=new Counter1(uV,pV,lV);
		//������� ���� �������� ������� �� 10 ����� � ����
		for(int i = 0;i < 10;i++) {
		objectCounter.increment();
		System.out.println("������� ��������� "+ objectCounter.pV());
		}
		
		for(int i = 0;i < 10;i++) {
			objectCounter.decrement();
			System.out.println("������� ��������� "+ objectCounter.pV());
			}
		
		
	}
	public int getUpperValue() {
		return upperValue;
	}
	public void setUpperValue(int upperValue) {
		this.upperValue = upperValue;
	}
	public int getLowerValue() {
		return lowerValue;
	}
	public void setLowerValue(int lowerValue) {
		this.lowerValue = lowerValue;
	}
	public int getPresentValue() {
		return presentValue;
	}
	public void setPresentValue(int presentValue) {
		this.presentValue = presentValue;
	}
}
