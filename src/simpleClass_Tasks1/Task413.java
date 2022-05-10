package simpleClass_Tasks1;

import java.util.ArrayList;
import java.util.List;

//������� ������ ������ �����������, ��������� ������ �������, �����, �����.
//������: 
//������� �� ������� 
//�������, 
//���������� ��������, 
//�������,
//��������� ������.
class State{//������
	private String name;
	private double square;
	// ����� ������ �������� ������ �������� 
	private List<Region> regions;
	State(String name,double square, List<Region> regions){
	this.setName(name);
	this.setSquare(square);
	this.regions=regions;
	}
	public List<Region> getRegions()  
	   { 
	       return regions; 
	   } //������� �� ������� �������
	public void printCapital() { 
	        List<Town> towns;
	        for(Region reg : regions) {
	        	towns = reg.getTowns();
	        	for (int i = 0; i < towns.size(); i++)
	        		if(towns.get(i).isCapital()==true)
	        	    System.out.println("������� ������� ��� ����� "+towns.get(i).getName());
	        }
		}
	//���������� ��������
	public int printSummRegion() { 
        int j=0;
        for(int i = 0; i < regions.size(); i++) 
        	j++;
        return j;
	}
	//��������� ������
	public void printRegionalCentrs() { 
        List<Town> towns;
        for(Region reg : regions) {
        	towns = reg.getTowns();
        	for (int i = 0; i < towns.size(); i++)
        		if(towns.get(i).isRegionalCenter()==true)
        	    System.out.println("������ ��������� ����� "+towns.get(i).getName());
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
class Region{//�������
	private String name;
	private double square;
	private List<District> districts;// ����� ������� �������� ������ ������� 
    private List<Town> towns;// ����� ������� �������� ������ ������� 
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
class District{//�����
	private String name;
	private double square;
	 District(String name, double square){
		 this.setName(name);
		 this.setSquare(square);
	 }
	// ����� ����� �������� ������ ������� 
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
		//�������� ������
		Town objTown = new Town("�����",true,true,35000.03);
		Town objTown4 = new Town("��������",false,false,3120.12);
		Town objTown5 = new Town("��������",false,false,17120.12);
		//�������� ��� ������
		Town objTown2 = new Town("�����",false,true,2120.12);
		Town objTown3 = new Town("������",false,false,2420.12);
		Town objTown6 = new Town("���������",false,false,16120.12);
		//�������� ������ �� ������� �������
		List<Town> listTown = new ArrayList<>();
	    listTown.add(objTown);
	    listTown.add(objTown4);
	    listTown.add(objTown5);
	  //�������� ������ �� ������� �������
	  	List<Town> listTown2 = new ArrayList<>();
	  	listTown2.add(objTown2);
	  	listTown2.add(objTown3);
	  	listTown2.add(objTown6);
	  //�������� ������
	  	District objDistrict = new  District("������� �����",10000.30);
	  	District objDistrict1 = new  District("���������� �����",10000.30);
	  	District objDistrict2 = new  District("���������� �����",10000.30);
	  	District objDistrict3 = new  District("��������� �����",5100.30);
	  	District objDistrict4 = new  District("���������� �����",5100.30);
	  	District objDistrict5 = new  District("����������� �����",5100.30);
	  //�������� ������ �� ������� 
	  	List<District> listDistrict = new ArrayList<>();
	  	listDistrict.add(objDistrict);
	  	listDistrict.add(objDistrict1);
	    listDistrict.add(objDistrict2);
	  	  //�������� ������ �� ������� 
	  	List<District> listDistrict2 = new ArrayList<>();
	  	listDistrict2.add(objDistrict3);
	  	listDistrict2.add(objDistrict4);
	  	listDistrict2.add(objDistrict5);
	  	//c������� �������
	  	Region objRegion = new Region("������� �������",90000.15,listDistrict,listTown);
	  	Region objRegion2 = new Region("��������� �������",83200.17,listDistrict2,listTown2);
	    //�������� ����� ��������
	  	List<Region> listRegion = new ArrayList<>();
	  	listRegion.add(objRegion);
	  	listRegion.add(objRegion2);
	  	
	  	//�������� ������
	  	State objState = new State("���������� ��������",10000.12,listRegion);
	  	System.out.println("=====������� 1=====");
	  	objState.printCapital();
	  	System.out.println("=====������� 2=====");
	  	System.out.println("���������� �������� "+objState.printSummRegion());
	  	System.out.println("=====������� 3=====");
	  	System.out.println("����� �������: "+objState.getSquare()+" ��.���.");
	  	System.out.println("=====������� 4=====");
	  	objState.printRegionalCentrs();
	}

}
