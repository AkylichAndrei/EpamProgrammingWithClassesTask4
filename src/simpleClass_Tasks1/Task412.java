package simpleClass_Tasks1;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
//Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
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
	private int gas; //бензин для работы двигателя двигателя
	Engine(int gas){
		this.setGas(gas);
	}
	public void start() 
    { 
		this.setGas(this.getGas()-1);//при запуске двигателя тратиться 1 топлива!
		if(this.getGas()>1)
        System.out.println("Двигатель запущен! ");
		if(this.getGas()<1)
			System.out.println("Двигатель не запущен! ");
    }
	public void stop() 
    { 
        System.out.println("Двигатель не работает и не тратит топливо! "); 
    }
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		if(gas < 1) {
		this.gas=0;
		System.out.println("Бензин закончился! требуется дозаправка!");
		}
		else
		this.gas = gas;
	} 
}
class Car{
	private String carModel;
	private boolean machineHealth;//исправность машины
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
    	System.out.println("случился прокол колеса! нельзя ехать! "); 
    	wheel.setNumber(wheel.getNumber()-1);
    	this.setMachineHealth(false);
    }
    public void wheelReplacement() {
    	System.out.println("произведена замена колеса! можно ехать! "); 
    	wheel.setNumber(4);
    	this.setMachineHealth(true);
    }
    //дозаправка машины
    public void refuel() {
    	System.out.println("Машина заправлена можно ехать! "); 
        engine.setGas(engine.getGas()+10);//при заправке доливается 10 топлива!
        this.setMachineHealth(true);
    }
    public void printModel() {
    	System.out.println("Модель машины "+this.getCarModel());
    }
    //движение машины
    public void move()  
    { 
            engine.start(); 
            if((engine.getGas()>4) && (this.isMachineHealth()==true)) {//если все 4 колеса впорядке можно ехать
            System.out.println("Машина поехала "); 
            engine.setGas(engine.getGas()-3);//при работе двигателя тратиться 3 топлива!
            }
            else  System.out.println("Машина не справна! ");
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
		    Engine engine = new Engine(10); //создадим двигатель с 10 литрами бензина
		    Wheel wheel = new Wheel(4);  //создадим 4 колеса 
	        Car car = new Car("Porshe 911",true,engine, wheel); //создадим машину
	        car.move();  // покатаемся на машине
	        car.move();  // ещё покатаемся на машин
	        car.printModel(); // узнаем марку
	        car.wheelPuncture();// устроим прокол
	        car.move(); // попробуем покатаемся на машине, но получится ли? возможно закончится бензин
	        car.refuel();//дозаправимся
	        car.wheelReplacement(); // меняем колесо
	        car.move(); // попробуем покатаемся на машине должно получится!:)
	}
}
