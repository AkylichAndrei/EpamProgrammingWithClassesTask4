package simpleClass_Tasks1;

import java.util.Scanner;

public class Time1 {
	private int hours;
	private int minutes;
	private int seconds;
	Time1(){
	}
	Time1(int h, int m, int s){
		this.setHours(h);
		this.setMinutes(m);
		this.setSeconds(s);
	}
	private void changeObject(int h, int m, int s) {
		this.setHours(h);
		this.setMinutes(m);
		this.setSeconds(s);
	}
	private void print(){
		System.out.println("Текущее время Часы: "+this.getHours()+" Минуты: "+this.getMinutes()+" Секунды:"+this.getSeconds());
	}
	public static void main(String[] args) {
		int h,m,s;
		Time1 objectTime = new Time1();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите часы: ");
		h = in.nextInt();
		System.out.println("Введите минуты: ");
		m = in.nextInt();
		System.out.println("Введите секунды: ");
		s = in.nextInt();
		objectTime = new Time1(h,m,s);
		objectTime.print();
		System.out.println("Попробуем изменить значение времени ");
		System.out.println("Введите часы: ");
		h = in.nextInt();
		System.out.println("Введите минуты: ");
		m = in.nextInt();
		System.out.println("Введите секунды: ");
		s = in.nextInt();
		in.close();
		objectTime.changeObject(h, m, s);
		objectTime.print();
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if((hours<=23)&&(hours>=0))
		this.hours = hours;
		else {
			System.out.println("Время введено некоректно! Зачение класса Часы будет равно 0 ");
			this.hours = 0;
		}
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		if((minutes<=59)&&(minutes>=0))
			this.minutes = minutes;
			else {
				System.out.println("Время введено некоректно! Зачение класса Минуты будет равно 0 ");
				this.minutes = 0;
			}
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		if((seconds<=59)&&(seconds>=0))
			this.seconds = seconds;
			else {
				System.out.println("Время введено некоректно! Зачение класса Секунды будет равно 0 ");
				this.seconds = 0;
			}
	}
}