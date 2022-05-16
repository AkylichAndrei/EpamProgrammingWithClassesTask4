package simpleClass_Tasks1;

import java.util.ArrayList;
import java.util.List;
//Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: 
//вывести на консоль 
//столицу, 
//количество областей, 
//площадь,
//областные центры.
class State{//страна
	private String name;
	private double square;
	// класс страна содержит список регионов 
	private List<Region> regions;
	State(String name,double square, List<Region> regions){
	this.setName(name);
	this.setSquare(square);
	this.regions=regions;
	}
	public List<Region> getRegions()  
	   { 
	       return regions; 
	   } //вывести на консоль столицу
	public void printCapital() { 
	        List<Town> towns;
	        for(Region reg : regions) {
	        	towns = reg.getTowns();
	        	for (int i = 0; i < towns.size(); i++)
	        		if(towns.get(i).isCapital()==true)
	        	    System.out.println("Найдена столица это город "+towns.get(i).getName());
	        }
		}
	//количество областей
	public int printSummRegion() { 
        int j=0;
        for(int i = 0; i < regions.size(); i++) 
        	j++;
        return j;
	}
	//областные центры
	public void printRegionalCentrs() { 
        List<Town> towns;
        for(Region reg : regions) {
        	towns = reg.getTowns();
        	for (int i = 0; i < towns.size(); i++)
        		if(towns.get(i).isRegionalCenter()==true)
        	    System.out.println("Найден областной центр "+towns.get(i).getName());
        }
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSquare() {
		return square;
	}
	public void setSquare(double square) {
		this.square = square;
	}
}
class Region{//область
	private String name;
	private double square;
	private List<District> districts;// класс область содержит список районов 
    private List<Town> towns;// класс область содержит список городов 
	Region(String name, double square,List<District> districts,List<Town> towns){
		this.setName(name);
		this.setSquare(square);
		this.districts=districts;
		this.towns=towns;
	}
	public List<District> getDistricts()  
	   { 
	       return districts; 
	   }
	public List<Town> getTowns()  
	   { 
	       return towns; 
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSquare() {
		return square;
	}
	public void setSquare(double square) {
		this.square = square;
	}
}
class District{//район
	private String name;
	private double square;
	 District(String name, double square){
		 this.setName(name);
		 this.setSquare(square);
	 }
	// класс район содержит список городов 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSquare() {
		return square;
	}
	public void setSquare(double square) {
		this.square = square;
	}
 }
class Town{
	private String name;
	private boolean capital;
	private boolean regionalCenter;
	private double square;
	Town(String name, boolean capital,boolean regionalCenter, double square){
		this.setName(name);
		this.setCapital(capital);
		this.setRegionalCenter(regionalCenter);
		this.setSquare(square);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCapital() {
		return capital;
	}
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
	public double getSquare() {
		return square;
	}
	public void setSquare(double square) {
		this.square = square;
	}
	public boolean isRegionalCenter() {
		return regionalCenter;
	}
	public void setRegionalCenter(boolean regionalCenter) {
		this.regionalCenter = regionalCenter;
	}
}
public class Task413 {
	public static void main(String[] args) {
		//Создадим города
		Town objTown = new Town("Минск",true,true,35000.03);
		Town objTown4 = new Town("Бобруйск",false,false,3120.12);
		Town objTown5 = new Town("Заславль",false,false,17120.12);
		//Создадим ещё города
		Town objTown2 = new Town("Брест",false,true,2120.12);
		Town objTown3 = new Town("Кобриб",false,false,2420.12);
		Town objTown6 = new Town("Белоозёрск",false,false,16120.12);
		//Создадим списки по районам городам
		List<Town> listTown = new ArrayList<>();
	    listTown.add(objTown);
	    listTown.add(objTown4);
	    listTown.add(objTown5);
	  //Создадим списки по районам городам
	  	List<Town> listTown2 = new ArrayList<>();
	  	listTown2.add(objTown2);
	  	listTown2.add(objTown3);
	  	listTown2.add(objTown6);
	  //Создадим районы
	  	District objDistrict = new  District("Минский район",10000.30);
	  	District objDistrict1 = new  District("Бобруйский район",10000.30);
	  	District objDistrict2 = new  District("Заславский район",10000.30);
	  	District objDistrict3 = new  District("Брестский район",5100.30);
	  	District objDistrict4 = new  District("Кобринский район",5100.30);
	  	District objDistrict5 = new  District("Белоозёрский район",5100.30);
	  //Создадим списки по районам 
	  	List<District> listDistrict = new ArrayList<>();
	  	listDistrict.add(objDistrict);
	  	listDistrict.add(objDistrict1);
	    listDistrict.add(objDistrict2);
	  	  //Создадим списки по районам 
	  	List<District> listDistrict2 = new ArrayList<>();
	  	listDistrict2.add(objDistrict3);
	  	listDistrict2.add(objDistrict4);
	  	listDistrict2.add(objDistrict5);
	  	//cоздадим области
	  	Region objRegion = new Region("Минская область",90000.15,listDistrict,listTown);
	  	Region objRegion2 = new Region("Брестская область",83200.17,listDistrict2,listTown2);
	    //Создадим спсок областей
	  	List<Region> listRegion = new ArrayList<>();
	  	listRegion.add(objRegion);
	  	listRegion.add(objRegion2);
	  	//Создадим страну
	  	State objState = new State("Республика Беларусь",10000.12,listRegion);
	  	System.out.println("=====Задание 1=====");
	  	objState.printCapital();
	  	System.out.println("=====Задание 2=====");
	  	System.out.println("Количество областей "+objState.printSummRegion());
	  	System.out.println("=====Задание 3=====");
	  	System.out.println("Общая площадь: "+objState.getSquare()+" кв.кил.");
	  	System.out.println("=====Задание 4=====");
	  	objState.printRegionalCentrs();
	}
}