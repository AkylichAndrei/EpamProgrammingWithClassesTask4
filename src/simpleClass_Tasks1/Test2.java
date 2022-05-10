package simpleClass_Tasks1;

// Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
// Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get-
// методы для полей экземпляра класса.
public class Test2 {
	 private int attribute1,attribute2;
	
	//конструктор с входными параметрами.
	Test2(int attribute1, int attribute2){
		this.setAttribute1(attribute1);
		this.setAttribute2(attribute2);
		System.out.println("Вызвали конструктор с входными параметрами " + this.attribute1+" и " + this.attribute2);
	}
	//конструктор по умолчанию
	Test2(){
		System.out.println("Вызвали конструктор по умолчанию");
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
		//инициализация конструктор с входными параметрами.
		Test2 objTest2_1 = new Test2(1,2);
		Test2 objTest2_2 = new Test2();
		objTest2_1.attribute1=0;
		objTest2_2.attribute2=0;
	}
	

}
