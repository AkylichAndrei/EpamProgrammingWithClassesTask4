package simpleClass_Tasks1;

//—оздать объект класса јвтомобиль, использу€ классы  олесо, ƒвигатель. 
//ћетоды: ехать, заправл€тьс€, мен€ть колесо, вывести на консоль марку автомобил€.
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
	private int gas; //бензин дл€ работы двигател€ двигател€
	Engine(int gas){
		this.setGas(gas);
	}
	public void start() 
    { 
		this.setGas(this.getGas()-1);//при запуске двигател€ тратитьс€ 1 топлива!
		if(this.getGas()>1)
        System.out.println("ƒвигатель запущен! ");
		if(this.getGas()<1)
			System.out.println("ƒвигатель не запущен! ");
        
    }
	
	public void stop() 
    { 
        System.out.println("ƒвигатель не работает и не тратит топливо! "); 
    }
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		if(gas < 1) {
		this.gas=0;
		System.out.println("Ѕензин закончилс€! требуетс€ дозаправка!");
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
    	System.out.println("случилс€ прокол колеса! нельз€ ехать! "); 
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
    	System.out.println("ћашина заправлена можно ехать! "); 
        engine.setGas(engine.getGas()+10);//при заправке доливаетс€ 10 топлива!
        this.setMachineHealth(true);
    }
    public void printModel() {
    	System.out.println("ћодель машины "+this.getCarModel());
    }
    //движение машины
    public void move()  
    { 
            engine.start(); 
            if((engine.getGas()>4) && (this.isMachineHealth()==true)) {//если все 4 колеса впор€дке можно ехать
            System.out.println("ћашина поехала "); 
            engine.setGas(engine.getGas()-3);//при работе двигател€ тратитьс€ 3 топлива!
            }
            else  System.out.println("ћашина не справна! ");
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
	        car.move();  // покатаемс€ на машине
	        car.move();  // ещЄ покатаемс€ на машин
	        car.printModel(); // узнаем марку
	        car.wheelPuncture();// устроим прокол
	        car.move(); // попробуем покатаемс€ на машине, но получитс€ ли? возможно закончитс€ бензин
	        car.refuel();//дозаправимс€
	        car.wheelReplacement(); // мен€ем колесо
	        car.move(); // попробуем покатаемс€ на машине должно получитс€!:)
	        
	}

}
