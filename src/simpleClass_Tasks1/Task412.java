package simpleClass_Tasks1;

//������� ������ ������ ����������, ��������� ������ ������, ���������. 
//������: �����, ������������, ������ ������, ������� �� ������� ����� ����������.
class Wheel{
	private int number;
	Wheel(int number){
		this.setNumber(number);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
class Engine{
	private int gas; //������ ��� ������ ��������� ���������
	Engine(int gas){
		this.setGas(gas);
	}
	public void start() 
    { 
		this.setGas(this.getGas()-1);//��� ������� ��������� ��������� 1 �������!
		if(this.getGas()>1)
        System.out.println("��������� �������! ");
		if(this.getGas()<1)
			System.out.println("��������� �� �������! ");
        
    }
	
	public void stop() 
    { 
        System.out.println("��������� �� �������� � �� ������ �������! "); 
    }
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		if(gas < 1) {
		this.gas=0;
		System.out.println("������ ����������! ��������� ����������!");
		}
		else
		this.gas = gas;
	} 
}
class Car{
	private String carModel;
	private boolean machineHealth;//����������� ������
    private final Engine engine; // Composition 
    private final Wheel wheel;  
      
    Car(String carModel, boolean machineHealth, Engine engine, Wheel wheel) 
    { 
    	this.setCarModel(carModel);
    	 this.setMachineHealth(machineHealth);
        this.engine = engine; 
        this.wheel=wheel;
       
    } 
    public void wheelPuncture() {
    	System.out.println("�������� ������ ������! ������ �����! "); 
    	wheel.setNumber(wheel.getNumber()-1);
    	this.setMachineHealth(false);
    }
    public void wheelReplacement() {
    	System.out.println("����������� ������ ������! ����� �����! "); 
    	wheel.setNumber(4);
    	this.setMachineHealth(true);
    }
      
    //���������� ������
    public void refuel() {
    	System.out.println("������ ���������� ����� �����! "); 
        engine.setGas(engine.getGas()+10);//��� �������� ���������� 10 �������!
        this.setMachineHealth(true);
    }
    public void printModel() {
    	System.out.println("������ ������ "+this.getCarModel());
    }
    //�������� ������
    public void move()  
    { 
            engine.start(); 
            if((engine.getGas()>4) && (this.isMachineHealth()==true)) {//���� ��� 4 ������ �������� ����� �����
            System.out.println("������ ������� "); 
            engine.setGas(engine.getGas()-3);//��� ������ ��������� ��������� 3 �������!
            }
            else  System.out.println("������ �� �������! ");
    }

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Wheel getWheel() {
		return wheel;
	}
	public boolean isMachineHealth() {
		return machineHealth;
	}
	public void setMachineHealth(boolean machineHealth) {
		this.machineHealth = machineHealth;
	} 
}

public class Task412 {

	public static void main(String[] args) {
		
		    Engine engine = new Engine(10); //�������� ��������� � 10 ������� �������
		    Wheel wheel = new Wheel(4);  //�������� 4 ������ 
	        Car car = new Car("Porshe 911",true,engine, wheel); //�������� ������
	        car.move();  // ���������� �� ������
	        car.move();  // ��� ���������� �� �����
	        car.printModel(); // ������ �����
	        car.wheelPuncture();// ������� ������
	        car.move(); // ��������� ���������� �� ������, �� ��������� ��? �������� ���������� ������
	        car.refuel();//������������
	        car.wheelReplacement(); // ������ ������
	        car.move(); // ��������� ���������� �� ������ ������ ���������!:)
	        
	}

}
