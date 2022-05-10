package simpleClass_Tasks1;

import java.util.ArrayList;
import java.util.List;

//Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
//         destination, flight number, type of aircraft, departure time(hours minutes seconds), days of the week.
//����� � �������:
//a) ������ ������ ��� ��������� ������ ����������;
//b) ������ ������ ��� ��������� ��� ������;
//c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
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
            " ��� ='" + name + '\'' +
            ", ������� =" + surname +
            ", ����� ����� ='" + seatNumber + '\'' +
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
    //������ ����������
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
    //a) ������ ������ ��� ��������� ������ ����������;
    //b) ������ ������ ��� ��������� ��� ������;
    //c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
    @Override
	public String toString() {
		String s="";
		  for (int i=0; i < passenger.size(); i++)
	        {
	            s = s + "|| ���: " + passenger.get(i).getName()+" |�������: "+passenger.get(i).getSurname()+" |����� �����: " + passenger.get(i).getSeatNumber();
	        }
		  //����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
			 return "{" +
            "����� ���������� ='" + destination + '\'' +
            ", ����� ����� =" + flightNumber +
            ", ��� ������� ='" + typeOfAircraft + '\'' +
            ", ����� ������ ='" + "����: "+departureTimeHours+" ������: "+departureTimeMinutes+" �������: "+departureTimeSeconds + '\'' +
            ", ���� ������ ='" + daysOfTheWeek + '\'' +

            ", ������ ��������� ='" + s  + '\'' +
            '}';
			
	}
	public static void main(String[] args) {
	
		//�������� ����������
		Passenger objPassenger = new Passenger("������","������",1);
		Passenger objPassenger1 = new Passenger("������","������",2);
		Passenger objPassenger2 = new Passenger("�������","������",3);
		Passenger objPassenger3 = new Passenger("������","�������",4);
		Passenger objPassenger4 = new Passenger("�������","�����",5);
		Passenger objPassenger5 = new Passenger("�������","������",6);
		//�������� ������ ���� ����������
		List <Passenger> passengers = new ArrayList<Passenger>(); 
		 passengers.add(objPassenger); 
		 passengers.add(objPassenger1);
		 passengers.add(objPassenger2); 
		 passengers.add(objPassenger3); 
		 passengers.add(objPassenger4); 
		 passengers.add(objPassenger5);
		//������ ������ ��� �������� �� ����
		 List <Passenger> passengers1 = new ArrayList<Passenger>(); 
		 passengers1.add(objPassenger); 
		 passengers1.add(objPassenger1);
		 List <Passenger> passengers2 = new ArrayList<Passenger>(); 
		 passengers2.add(objPassenger2); 
		 passengers2.add(objPassenger3);
		 List <Passenger> passengers3 = new ArrayList<Passenger>(); 
		 passengers3.add(objPassenger4); 
		 passengers3.add(objPassenger5);
		
		 //������ ������������ � ������ ���������� �� ����
		 Airline objAirline = new Airline("������������� ����������",312,"Boing 747",10,30,0,"�����������",passengers1);
		 Airline objAirline2 = new Airline("�������",313,"Boing 747",12,30,0,"�������",passengers2);
		 Airline objAirline3 = new Airline("���������� ��������",314,"Boing 747",14,30,0,"C����",passengers3);
		 Airline objAirline4 = new Airline("�������",314,"Boing 747",9,30,0,"C����",passengers3);
		 
		 //������ ��� ������������ � ���� ������
		 List <Airline> airlines = new ArrayList<Airline>(); 
		 airlines.add(objAirline); 
		 airlines.add(objAirline2); 
		 airlines.add(objAirline3); 
		 airlines.add(objAirline4);
		 
		 System.out.println("------- ����� ������ ���� ���������-----");
			
		    for (Passenger u : passengers) {
		    	
		        System.out.println(u);
		    }
		 System.out.println("------- ����� ������ ��������� ������-----");
			
		    for (Airline u : airlines) {
		    	
		        System.out.println(u);
		    }
		 System.out.println("------- ������ ������ ��� ��������� ������ ����������(������������� ����������)-----");
			
		    for (Airline u : airlines) {
		    	if(u.getDestination()=="������������� ����������")
		        System.out.println(u);
		    }
		 System.out.println("------- ������ ������ ��� ��������� ��� ������(�������)-----");
			
		    for (Airline u : airlines) {
		    	if(u.getDaysOfTheWeek()=="�������")
		        System.out.println(u);
		    }
		 System.out.println("------- ������ ������ ��� ��������� ��� ������(�����), ����� ������ ��� ������� ������ ���������(����� ����� ������� 12:00+).-----");
			
		    for (Airline u : airlines) {
		    	if((u.getDaysOfTheWeek()=="C����")&&(u.getDepartureTimeHours()>12))
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
