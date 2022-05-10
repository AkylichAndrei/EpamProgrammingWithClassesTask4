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
			System.out.println("вы достигли верхней границцы дивапазона ");
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
				System.out.println("вы достигли верхней границцы дивапазона ");
	}
	private int pV() {
		return getPresentValue();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uV,pV,lV;
		Counter1 objectCounter = new Counter1();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите верхнюю границу диапазона: ");
		uV = in.nextInt();
		System.out.println("Введите нижнюю границу диапазона: ");
		lV = in.nextInt();
		System.out.println("Введите текущее состояние: ");
		pV = in.nextInt();
		in.close();
		objectCounter=new Counter1(uV,pV,lV);
		//проведём тест запустим счётчик до 10 вверх и вниз
		for(int i = 0;i < 10;i++) {
		objectCounter.increment();
		System.out.println("Текущее состояние "+ objectCounter.pV());
		}
		
		for(int i = 0;i < 10;i++) {
			objectCounter.decrement();
			System.out.println("Текущее состояние "+ objectCounter.pV());
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
