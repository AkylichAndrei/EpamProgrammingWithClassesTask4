package simpleClass_Tasks1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Туристические путевки. 
// Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. 
// Реализовать выбор и сортировку путевок.
class Offer implements Comparable <Offer>{
	private String name;
	private List<Voucher> vouchers;
	Offer(String name,List<Voucher> vouchers){
		this.setName(name);
		this.vouchers = vouchers;
	} 
	//Реализуем сортировку по фамилии
	  @Override
		 //реализуем метод compareTo интерфейса Comparable
		     public int compareTo(Offer o) {
		          int   result = this.name.compareTo(o.name);
		         return result;
		     }
		 @Override
		public String toString() {
			String s="";
			  for (int i=0; i < vouchers.size(); i++)
		        {
		            s = s + " |=|=| Номер путёвки: "
		            		+ ""+vouchers.get(i).getNumber()+" "
		            				+ "|| Транспорт: "
		            				+ ""+vouchers.get(i).getTransport()+" |||"
		            						+ "|| Питание: "
				            				+ ""+vouchers.get(i).getFood()+" |||"
				            						+ "|| Число дней прибывания: "
						            				+ ""+vouchers.get(i).getNumberOfDays()+" |||"
						            						+ "|| Тип путешествия: "
								            				+ ""+vouchers.get(i).getType()+" |=|=|"
		            						+ " ";
		        }
				 return "{" +
	            "Название предложения :'" + name + '\'' +
	            ", Список путёвок для предложения : ||'" + s  + '\'' +
	            '}';
		}
	public List<Voucher> getVouchers() {
		return vouchers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Voucher{
	private int number;
	private String country;
	private String transport;
	private String food;
	private int numberOfDays;
	private String type;
	Voucher(int number,String country,String transport,String food,int numberOfDays,String type){
		this.setNumber(number);
		this.setCountry(country);
		this.setTransport(transport);
		this.setFood(food);
		this.setNumberOfDays(numberOfDays);
		this.setType(type);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
public class Task415 {
	public static void main(String[] args) {
		Voucher objVoucer = new Voucher(390001,"Доминикана","Авиакомпания AzurAir","All inclusive",30,"Отдых");
		Voucher objVoucer1 = new Voucher(390002,"Филипины","Авиакомпания AzurAir","All inclusive",30,"Отдых");
		Voucher objVoucer2 = new Voucher(390003,"Вьетнам","Авиакомпания БелАвиа","HB",15,"Отдых");
		Voucher objVoucer3 = new Voucher(390004,"Мальдивы","Авиакомпания БелАвиа","HB",9,"Лечение");
		Voucher objVoucer4 = new Voucher(390005,"Мексика","Авиакомпания AzurAir","All inclusive",30,"Лечение");
		Voucher objVoucer5 = new Voucher(390006,"Греция","Авиакомпания Аэрофлот","All inclusive",10,"Экскурсии");
		Voucher objVoucer6 = new Voucher(390007,"Греция","Авиакомпания Аэрофлот","All inclusive",15,"Экскурсии");
		Voucher objVoucer7 = new Voucher(390006,"Франция","Авиакомпания Аэрофлот","HB",10,"Шопинг");
		Voucher objVoucer8 = new Voucher(390007,"Франция","Авиакомпания Аэрофлот","HB",15,"Шопинг");
		Voucher objVoucer9 = new Voucher(390008,"Антарктика","Авиакомпания Аэрофлот","All inclusive",10,"Круиз");
		Voucher objVoucer10 = new Voucher(390009,"Амазонка","Авиакомпания Аэрофлот","All inclusive",15,"Круиз");
		// (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
		//объеденим всех клиенов для удобства
	 	List<Voucher> relaxationVouchers = new ArrayList<>();
	 	relaxationVouchers.add(objVoucer);
	 	relaxationVouchers.add(objVoucer1);
	 	relaxationVouchers.add(objVoucer2);
		List<Voucher> excursionsVouchers = new ArrayList<>();
		excursionsVouchers.add(objVoucer3);
		excursionsVouchers.add(objVoucer4);
		List<Voucher> treatmentVouchers = new ArrayList<>();
		treatmentVouchers.add(objVoucer5);
		treatmentVouchers.add(objVoucer6);
		List<Voucher> shoppingVouchers = new ArrayList<>();
		shoppingVouchers.add(objVoucer7);
		shoppingVouchers.add(objVoucer8);
		List<Voucher> cruiseVouchers = new ArrayList<>();
		cruiseVouchers.add(objVoucer9);
		cruiseVouchers.add(objVoucer10);
		Offer objVoucher1 = new Offer("Предложение по отдыху", relaxationVouchers);
		Offer objVoucher2 = new Offer("Предложение по экскурсиям", excursionsVouchers);
		Offer objVoucher3 = new Offer("Предложение по лечния", treatmentVouchers);
		Offer objVoucher4 = new Offer("Предложение по шопингу", shoppingVouchers);
		Offer objVoucher5 = new Offer("Предложение по круизу", cruiseVouchers);
		List<Offer> listOffer = new ArrayList<>();
		listOffer.add(objVoucher1);
		listOffer.add(objVoucher2);
		listOffer.add(objVoucher3);
		listOffer.add(objVoucher4);
		listOffer.add(objVoucher5);
		//Реализуем поиск 
	 	System.out.println("===== Задание 1 =====");
	 	System.out.println("===== Выведем все предложения до сортировки");
	    for (Offer u : listOffer) {
	    	System.out.println(u);
	    }
	 	System.out.println("===== Выведем все предложения после сортировки названию предложения");
	 	Collections.sort(listOffer);
	    for (Offer u : listOffer) {
	    	System.out.println(u);
	    }
	    //Реализуем 
	 	System.out.println("===== Задание 2 =====");
	 	System.out.println("===== Выведем выборку по транспорту, все предложения авиакомпании AzurAir");
	    for (Offer u : listOffer) {
	    	for(int i=0;i<u.getVouchers().size();i++)
	    	if (u.getVouchers().get(i).getTransport()=="Авиакомпания AzurAir")
	    	System.out.println("Найдена путёвка: "+u.getVouchers().get(i).getNumber()+" "
	    			+ ""+u.getVouchers().get(i).getTransport()+" "
	    					+ "Страна назначения "+u.getVouchers().get(i).getCountry());
	    }
	    System.out.println("===== Задание 3 =====");
	 	System.out.println("===== Выведем выборку по итанию, все предложения где всё включено");
	    for (Offer u : listOffer) {
	    	for(int i=0;i<u.getVouchers().size();i++)
	    	if (u.getVouchers().get(i).getFood()=="All inclusive")
	    	System.out.println("Найдена путёвка: "+u.getVouchers().get(i).getNumber()+" "
	    			+ "Тип питания: "+u.getVouchers().get(i).getFood()+" "
	    					+ "Страна назначения "+u.getVouchers().get(i).getCountry());
	    }
	    System.out.println("===== Задание 4 =====");
	 	System.out.println("===== Выведем выборку по числу дней, все путевки на 30 дней");
	    for (Offer u : listOffer) {
	    	for(int i=0;i<u.getVouchers().size();i++)
	    	if (u.getVouchers().get(i).getNumberOfDays()==30)
	    	System.out.println("Найдена путёвка: "+u.getVouchers().get(i).getNumber()+" "
	    			+ " Количество дней: "+u.getVouchers().get(i).getNumberOfDays()+" "
	    					+ "Страна назначения "+u.getVouchers().get(i).getCountry());
	    }
	}
}