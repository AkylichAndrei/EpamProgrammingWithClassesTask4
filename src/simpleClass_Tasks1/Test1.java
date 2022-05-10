package simpleClass_Tasks1;
// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих 
// переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит 
// наибольшее значение из этих двух переменных.
import java.util.Scanner;

public class Test1 {
	private int attribute1,attribute2; 
	
	private void print() {
		System.out.println("Значение первой переменной: " + attribute1);
		System.out.println("Значение второй переменной: " + attribute2);
	}
	private void scan() {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите значение первой переменной: ");
		attribute1 = in.nextInt();
		System.out.println("Введите значение второй переменной: ");
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
		System.out.println("Сумма атрибутов: " + objectTest1.summ());
		System.out.println("Значение наибольшео атрибута: " + objectTest1.compaire());
	}

}
