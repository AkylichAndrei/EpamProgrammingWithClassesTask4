package simpleClass_Tasks1;

import java.util.ArrayList;
import java.util.List;

//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//         destination, flight number, type of aircraft, departure time(hours minutes seconds), days of the week.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
class Passenger{//passenger, name, surname, seat number
	private String name;
	private String surname;
	private int seatNumber;
	Passenger(String name, String surname, int seatNumber){
		this.setName(name);
		this.setSurname(surname);
		this.setSeatNumber(seatNumber);
	}
	@Override
	public String toString() {
			 return "{" +
            " Имя ='" + name + '\'' +
            ", Фамилия =" + surname +
            ", Номер места ='" + seatNumber + '\'' +
            '}';
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
}
public class Airline {
    private String destination;
    private int flightNumber;
    private String typeOfAircraft;
    private int departureTimeHours;
    private int departureTimeMinutes;
    private int departureTimeSeconds;
    private String daysOfTheWeek;//monday, tuesday, wednesday, thursday, friday, saturday, sunday
    //Список пассажиров
    private List<Passenger> passenger;
    Airline(String des, int fN, String tOA, int dTH, int dTM, int dTS, String dOTW,List<Passenger> passenger){
    	this.setDestination(des);
    	this.setFlightNumber(fN);
    	this.setTypeOfAircraft(tOA);
    	this.setDepartureTimeHours(dTH);
    	this.setDepartureTimeMinutes(dTM);
    	this.setDepartureTimeSeconds(dTS);
    	this.setDaysOfTheWeek(dOTW);
    	this.passenger=passenger;
    }
    public List<Passenger> getPassenger()  
    { 
        return passenger; 
    } 
    //a) список рейсов для заданного пункта назначения;
    //b) список рейсов для заданного дня недели;
    //c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
    @Override
	public String toString() {
		String s="";
		  for (int i=0; i < passenger.size(); i++)
	        {
	            s = s + "|| имя: " + passenger.get(i).getName()+" |Фамилия: "+passenger.get(i).getSurname()+" |Номер места: " + passenger.get(i).getSeatNumber();
	        }
		  //пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
			 return "{" +
            "Пункт назначения ='" + destination + '\'' +
            ", номер рейса =" + flightNumber +
            ", тип самолёта ='" + typeOfAircraft + '\'' +
            ", время вылета ='" + "Часы: "+departureTimeHours+" Минуты: "+departureTimeMinutes+" Секунды: "+departureTimeSeconds + '\'' +
            ", День недели ='" + daysOfTheWeek + '\'' +

            ", Список пасажиров ='" + s  + '\'' +
            '}';
	}
	public static void main(String[] args) {
		//создадим пассажиров
		Passenger objPassenger = new Passenger("Андрей","Акулич",1);
		Passenger objPassenger1 = new Passenger("Сергей","Утиков",2);
		Passenger objPassenger2 = new Passenger("Алексей","Позняк",3);
		Passenger objPassenger3 = new Passenger("Андрей","Жилянин",4);
		Passenger objPassenger4 = new Passenger("Дмитрий","Карев",5);
		Passenger objPassenger5 = new Passenger("Дмитрий","Вихров",6);
		//создадим список всех пассажиров
		List <Passenger> passengers = new ArrayList<Passenger>(); 
		 passengers.add(objPassenger); 
		 passengers.add(objPassenger1);
		 passengers.add(objPassenger2); 
		 passengers.add(objPassenger3); 
		 passengers.add(objPassenger4); 
		 passengers.add(objPassenger5);
		//создаём списки для отправки на рейс
		 List <Passenger> passengers1 = new ArrayList<Passenger>(); 
		 passengers1.add(objPassenger); 
		 passengers1.add(objPassenger1);
		 List <Passenger> passengers2 = new ArrayList<Passenger>(); 
		 passengers2.add(objPassenger2); 
		 passengers2.add(objPassenger3);
		 List <Passenger> passengers3 = new ArrayList<Passenger>(); 
		 passengers3.add(objPassenger4); 
		 passengers3.add(objPassenger5);
		 //создаём авиокомпании и покуем пассажиров на рейс
		 Airline objAirline = new Airline("Доминиканская республика",312,"Boing 747",10,30,0,"Понедельник",passengers1);
		 Airline objAirline2 = new Airline("Нигерия",313,"Boing 747",12,30,0,"Вторник",passengers2);
		 Airline objAirline3 = new Airline("Республика Беларусь",314,"Boing 747",14,30,0,"Cреда",passengers3);
		 Airline objAirline4 = new Airline("Украина",314,"Boing 747",9,30,0,"Cреда",passengers3);
		 //покуем все авиокомпании в один список
		 List <Airline> airlines = new ArrayList<Airline>(); 
		 airlines.add(objAirline); 
		 airlines.add(objAirline2); 
		 airlines.add(objAirline3); 
		 airlines.add(objAirline4);
		 System.out.println("------- общий список всех пссажиров-----");
		    for (Passenger u : passengers) {
		        System.out.println(u);
		    }
		 System.out.println("------- общий список доступных рейсов-----");
		    for (Airline u : airlines) {
		        System.out.println(u);
		    }
		 System.out.println("------- список рейсов для заданного пункта назначения(Доминиканская республика)-----");
		    for (Airline u : airlines) {
		    	if(u.getDestination()=="Доминиканская республика")
		        System.out.println(u);
		    }
		 System.out.println("------- список рейсов для заданного дня недели(Вторник)-----");
		    for (Airline u : airlines) {
		    	if(u.getDaysOfTheWeek()=="Вторник")
		        System.out.println(u);
		    }
		 System.out.println("------- список рейсов для заданного дня недели(Среда), время вылета для которых больше заданного(время после полудня 12:00+).-----");
		    for (Airline u : airlines) {
		    	if((u.getDaysOfTheWeek()=="Cреда")&&(u.getDepartureTimeHours()>12))
		        System.out.println(u);
		    }
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getTypeOfAircraft() {
		return typeOfAircraft;
	}
	public void setTypeOfAircraft(String typeOfAircraft) {
		this.typeOfAircraft = typeOfAircraft;
	}
	public int getDepartureTimeHours() {
		return departureTimeHours;
	}
	public void setDepartureTimeHours(int departureTimeHours) {
		this.departureTimeHours = departureTimeHours;
	}
	public int getDepartureTimeMinutes() {
		return departureTimeMinutes;
	}
	public void setDepartureTimeMinutes(int departureTimeMinutes) {
		this.departureTimeMinutes = departureTimeMinutes;
	}
	public int getDepartureTimeSeconds() {
		return departureTimeSeconds;
	}
	public void setDepartureTimeSeconds(int departureTimeSeconds) {
		this.departureTimeSeconds = departureTimeSeconds;
	}
	public String getDaysOfTheWeek() {
		return daysOfTheWeek;
	}
	public void setDaysOfTheWeek(String daysOfTheWeek) {
		this.daysOfTheWeek = daysOfTheWeek;
	}
}